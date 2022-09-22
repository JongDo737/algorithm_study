import java.util.Arrays;
import java.util.Stack;

public class Main11 {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        int[] people = {70, 50, 80,50,60};
        int limit = 120;
        System.out.println(sol.solution(people,limit));
        
    }
}
class Solution11 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 최소와 최대값을 비교하여 limit-min 값보다 큰사람은 보트 1칸씩 차지하게 하고
        Arrays.sort(people);
        int heavyPeopleIndex=0;
        for(int i=0; i<people.length; i++) {
            if(limit-people[0]<people[i]){
                heavyPeopleIndex=i;
                answer +=people.length-i;       //무거운 사람 바로 컷
                // 0 1 2 3
                break;
            }
        }
        System.out.println(heavyPeopleIndex);
        System.out.println(answer);
        System.out.println((heavyPeopleIndex)%2);
        int lastPerson = heavyPeopleIndex-1;
        for(int i=0; i<heavyPeopleIndex; i++) {

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
            }
        }

        return answer;
    }
}