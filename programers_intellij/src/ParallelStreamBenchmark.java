import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;
import java.util.stream.Stream;
// 벤치마크 대상 메서드를 실행하는 데 걸린 평균 시간 측정
@BenchmarkMode(Mode.AverageTime)
// 벤치마크 결과를 밀리초 단위로 출력
@OutputTimeUnit(TimeUnit.MILLISECONDS)
// 4Gb의 힙 공간을 제공한 환경에서 두 번 벤치마크를 수행해 결과의 신뢰성 확보
@Fork(value = 2, jvmArgs = {"-Xms4G", "-Xmx4G"})
public class ParallelStreamBenchmark {
    private static final long n = 10_000_000L;
    // 벤치마크 대상 메서드
    @Benchmark
    public long sequentialSum(){
        return Stream.iterate(1L, i->i+1).limit(n)
                .reduce(0L, Long::sum);
    }

    // 매 번 벤치마크를 싱행한 다음에는 가비지 컬렉터 동작 시도
    @TearDown(Level.Invocation)
    public void tearDown(){
        System.gc();
    }

    @Benchmark
    public long rangedSum1(){
        return LongStream.rangeClosed(1,n)
                .reduce(0L, Long::sum);
    }
    @Benchmark
    public long rangedSum2(){
        return LongStream.rangeClosed(1,n)
                .parallel()
                .reduce(0L, Long::sum);
    }
}
