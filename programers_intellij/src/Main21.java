import java.util.*;

public class Main21 {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("jongmin", "jaydee", "hihhihihi");
        List<String> friendsList = List.of("jongmin", "jaydee", "hihhihihi");
        // 집합 펙토리
        Set<String> friendsSet = Set.of("jongmin", "jaydee", "hihhihihi");

        Map<String,Integer> ageOfFriends = Map.of("jongmin",23, "jaydee",21, "hihhihihi",26);

        Map<String,Integer> ageOfFriends2 = Map.ofEntries(Map.entry("jongmin",23),
                                                            Map.entry("jaydee",21),
                                                            Map.entry("hihhihihi",26));

//        for(Iterator<Transaction> iterator = transactions.iterator(); iterator.hasNext();) {
//            Transaction transaction = iterator.next();
//            if(Character.isDigit(transaction.getReferenceCode().charAt(0))){
//                iterator.remove();
//            }
//        }

        for(Map.Entry<String,Integer> entry : ageOfFriends2.entrySet()){
            String friend = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(friend+" is "+age+" years old");
        }
        ageOfFriends2.forEach((friend, age) -> System.out.println(friend+" is "+age+" years old"));

        ageOfFriends2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(System.out::println);
    }



}
class Transaction{
    String code;
    public String getReferenceCode(){
        return code;
    }
}
