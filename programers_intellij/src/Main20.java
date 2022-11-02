import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main20 {
    public static void main(String[] args) {
        // 퀴즈 5-2

        //map
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
        List<Integer> jaegop = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        Iterator iter = jaegop.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        // flatmap
        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);
        List<int[]> pairs = number1.stream()
                .flatMap(i -> number2.stream()
                        .map(j -> new int[]{i, j})
                )
                .collect(Collectors.toList());


        //findAny()
        Optional<Integer> someNumbers = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n % 2 == 0)
                .findAny();     // 9
        System.out.println(someNumbers.get());

        //reduce
        // reduce (초기값 , 두 요소를 조합해서 새로운 값을 만드는 BinaryOperator<T>.
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        // 자바 8 Integer sum메서드
        int sum2 = numbers.stream().reduce(0, Integer::sum);

        // 초기값 없는 reduce  -> return Optional객체
        Optional<Integer> sum3 = numbers.stream().reduce((a, b) -> a + b);

        //퀴즈 5-3  Dish 개수를 map과 reduce로 구하기
        int sum4 = numbers.stream()
                .map(dish -> 1)
                .reduce(0, (a, b) -> a + b);
        // or
        Long sum5 = numbers.stream().count();

        // 대문자 -> 출력
        List<String> str = Arrays.asList("Modern", "Java", "In", "Action");
        str.stream().map(String::toUpperCase).forEach(System.out::println);

        // 배열로 스트림 만들기
        int[] numArr = {2, 3, 5, 7, 11, 13};
        int sum6 = Arrays.stream(numArr).reduce(0, (a, b) -> a + b);
    }


}
