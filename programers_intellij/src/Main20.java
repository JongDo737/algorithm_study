import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main20 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> jaegop = numbers.stream()
                                      .map(num -> num*num)
                .collect(Collectors.toList());
        Iterator iter = jaegop.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
