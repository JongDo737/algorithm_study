import java.security.KeyStore;
import java.util.*;

public class Main17 {
    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        String user = "mrko";
        List<String> a = new ArrayList<>();
        a.add("donut");
        a.add("zndole");
        List<String> b = new ArrayList<>();
        b.add("donut");
        b.add("jun");
        List<String> c = new ArrayList<>();
        c.add("donut");
        c.add("mrko");
        List<String> d = new ArrayList<>();
        d.add("shakevan");
        d.add("zndole");
        List<String> e = new ArrayList<>();
        e.add("shakevan");
        e.add("jun");
        List<String> f = new ArrayList<>();
        f.add("shakevan");
        f.add("mrko");
        List<List<String>> friends = new ArrayList<>();
        friends.add(a);
        friends.add(b);
        friends.add(c);
        friends.add(d);
        friends.add(e);
        friends.add(f);
        List<String> visitors = new ArrayList<>();
        visitors.add("bedi");
        visitors.add("bedi");
        visitors.add("donut");
        visitors.add("bedi");
        visitors.add("shakevan");
        System.out.println(problem1.solution(user, friends, visitors));
    }
}

class Problem1 {
    public List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>();
        Set<String> totalFriends = new HashSet<>();     // 친구 추천 목록
        for (int i = 0; i < friends.size(); i++) {
            for (int j = 0; j < friends.get(0).size(); j++) {
                totalFriends.add(friends.get(i).get(j));        // friends에 있는 목록
            }
        }
        for (int i = 0; i < visitors.size(); i++) {
            totalFriends.add(visitors.get(i));                  // visitors 목록
        }

        for (int i = 0; i < friends.size(); i++) {
            for (int j = 0; j < friends.get(i).size(); j++) {
                totalFriends.add(friends.get(i).get(j));        // 친구추천 목록 추가
            }

            if (friends.get(i).get(0).equals(user)) {
                totalFriends.remove(friends.get(i).get(1));         // 친구는 친구추천 목록에서 제거

            } else if (friends.get(i).get(1).equals(user)) {
                totalFriends.remove(friends.get(i).get(0));

            }
        }
        totalFriends.remove(user);      // 자신도 친구추천 목록에서 제거
        Map<String, Integer> scoreMap = new HashMap<>();
        List<String> totalList = new ArrayList<>(totalFriends);
        for (int i = 0; i < totalFriends.size(); i++) {
            scoreMap.put(totalList.get(i), 0);
        }
        // 친구목록에서 10점씩
        for (int i = 0; i < friends.size(); i++) {
            for (int j = 0; j < friends.get(j).size(); j++) {
                if (scoreMap.containsKey(friends.get(i).get(j))) {
                    scoreMap.replace(friends.get(i).get(j), scoreMap.get(friends.get(i).get(j)) + 10); // 친구당 10점 추가
                }
            }
        }
        // 방문자에서 1점씩
        for (int i = 0; i < visitors.size(); i++) {
            if (scoreMap.containsKey(visitors.get(i))) {
                scoreMap.replace(visitors.get(i), scoreMap.get(visitors.get(i)) + 1); // 친구당 10점 추가
            }
        }
        System.out.println(scoreMap.get("zndole"));
        System.out.println(scoreMap.get("jun"));
        System.out.println(scoreMap.get("bedi"));
        // Map.Entry 리스트 작성
        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(scoreMap.entrySet());

        // 비교함수 Comparator를 사용하여 오름차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<String, Integer>>() {
            // compare로 값을 비교
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // 오름 차순 정렬
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //        System.out.println("오름 차순 정렬");
        // 결과 출력
        for (int i = 0; i < list_entries.size() && i < 5; i++) {
            answer.add(list_entries.get(i).getKey());
        }


        return answer;
    }
}