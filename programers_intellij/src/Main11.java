import java.util.Arrays;
import java.util.Stack;

public class Main11 {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        int[] people = {70,80,50,50};
        int limit = 100;
        System.out.println(sol.solution(people,limit));
        
    }
}
class Solution11 {
    public int solution(int[] people, int limit) {

        int answer = 0;
        // 최소와 최대값을 비교하여 limit-min 값보다 큰사람은 보트 1칸씩 차지하게 하고
        Arrays.sort(people);
        
        int heavyPeopleIndex=people.length;
        int lastPerson = heavyPeopleIndex-1;
        for(int i=0; i<heavyPeopleIndex; i++) {
            System.out.println(people[i] +" "+people[lastPerson]);
            if(i==lastPerson) {
                answer+=1;
                break;
            }else if(i>lastPerson) break;


            if(people[i]+people[lastPerson]<=limit) {   // 무게가 맞으면
                answer+=1;
                lastPerson-=1;
            }else {                                     // 무게가 맞지 않으면 무거운사람 혼자 태우고 그 앞사람과 다시 비교 시키기
                answer+=1;
                lastPerson-=1;
                i--;
            }
        }

        return answer;
    }
}