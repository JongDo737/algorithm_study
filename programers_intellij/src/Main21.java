import java.util.*;

public class Main21 {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("jongmin", "jaydee", "hihhihihi");
        List<String> friendsList = List.of("jongmin", "jaydee", "hihhihihi");
        // 집합 펙토리
        Set<String> friendsSet = Set.of("jongmin", "jaydee", "hihhihihi");

        Map<String, Integer> ageOfFriends = Map.of("jongmin", 23, "jaydee", 21, "hihhihihi", 26);

        Map<String, Integer> ageOfFriends2 = Map.ofEntries(Map.entry("jongmin", 23),
                Map.entry("jaydee", 21),
                Map.entry("hihhihihi", 26));
        Map<String, Integer> ageOfFriends3 = Map.ofEntries(
                Map.entry("Raphael", 30),
                Map.entry("Olivia", 25),
                Map.entry("Thibaut", 26));

//        for(Iterator<Transaction> iterator = transactions.iterator(); iterator.hasNext();) {
//            Transaction transaction = iterator.next();
//            if(Character.isDigit(transaction.getReferenceCode().charAt(0))){
//                iterator.remove();
//            }
//        }

        for (Map.Entry<String, Integer> entry : ageOfFriends2.entrySet()) {
            String friend = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(friend + " is " + age + " years old");
        }
        ageOfFriends2.forEach((friend, age) -> System.out.println(friend + " is " + age + " years old"));

        ageOfFriends2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(System.out::println);

        System.out.println(ageOfFriends2.getOrDefault("jongmin", 1));        // jongmin이 없으면 1을 반환
//        System.out.println(ageOfFriends2.getOrDefault("jongmin","matrix"));
//        ageOfFriends2.remove("jongmin",24); // 키와 값이 맞으면 삭제

//        ageOfFriends2.replaceAll((name, age) -> age+1);
//        ageOfFriends2.replace(key, value);
        ageOfFriends3.putAll(ageOfFriends2);
        Map<String, Integer> everyone = new HashMap<>(ageOfFriends2);
        ageOfFriends3.forEach((k,v) -> everyone.merge(k,v,(name,age) -> name+age));
        System.out.println(everyone);
    }


}
class Transaction{
    String code;
    public String getReferenceCode(){
        return code;
    }
}
