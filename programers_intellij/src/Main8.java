import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int brown = 10;
        int yellow = 2;
        System.out.println(sol.solution(brown,yellow));
        
    }
}
class Solution8 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 곱 두개로 나눈 다음 가로-2 * 세로 -2 == yellow
        int total = brown+yellow;
        List<Integer> divisor = new ArrayList<>();
        for(int i=3; i<total/2+1; i++){
            if(total % i==0) divisor.add(i);
        }
        for(int i=0; i<divisor.size(); i++) {
            int temp = total/divisor.get(i);
            if((divisor.get(i)-2)*(temp-2)==yellow) {
                answer[1]=temp;
                answer[0]=divisor.get(i);
            }

        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}