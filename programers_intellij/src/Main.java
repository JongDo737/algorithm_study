
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        System.out.println(sol.solution(gems));

    }
}
class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        int start=0;
        int end=0;
        int min = 10000;
        
        Set<String> strSet = new HashSet<>();
        for(int i=0; i<gems.length; i++) {
            strSet.add(gems[i]);
        }
        for(int i=0; i<gems.length; i++){       // start
            List<String> strList = new ArrayList<>();
            for(int j=i; j<gems.length; j++){     // end
                boolean totalCheck = false;
                strList.add(gems[j]);
                if(strList.size() >= strSet.size()) {

                    Iterator iter = strSet.iterator();
                    int count=0;
                    while(iter.hasNext()) {
                        if(strList.contains(iter.next())){
                            count++;
                        }else break;
                    }
                    if(count==strSet.size()) {
                        totalCheck = true;
                    }

                    if(totalCheck) {        //4개다 존재할 때
                        int tempMin = j-i;
                        if(tempMin<min){
                            min = tempMin;

                            start = i;
                            end = j;
                        }
                        break;      // end 값만 늘어나는건 의미가 없음
                    }
                }


            }
        }
//        System.out.println("start : " + (start+1));
//        System.out.println("end : " + (end+1));
        answer[0]=start+1;
        answer[1]=end+1;
        return answer;
    }
}
//hashset 담기
// 반복문 돌려서4개가 포함됐는지 체크, min max 값 찾기