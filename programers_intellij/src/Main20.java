import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main20 {
    public static void main(String[] args) {
        // 퀴즈 5-2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
        List<Integer> jaegop = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        Iterator iter = jaegop.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);
        List<int[]> pairs = number1.stream()
                .flatMap(i -> number2.stream()
                        .map(j -> new int[]{i, j})
                )
                .collect(Collectors.toList());

        Optional<Integer> someNumbers = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n % 2 == 0)
                .findAny();     // 9
        System.out.println(someNumbers.get());
    }


}
