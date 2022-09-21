import java.math.BigInteger;

public class Main7 {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int n = 78;
        System.out.println(sol.solution(n));
        
    }
}
class Solution7 {
    public int solution(int n) {
        int answer = 0;
        // n 보다 큼
        // 2진수 1의 갯수가 같음
        int oneCount = Integer.toBinaryString(n).replace("0","").length(); //2진수 -> 0없애기 -> 1의 갯수
        for(int i=n+1; true;i++) {
            if(Integer.toBinaryString(i).replace("0","").length()== oneCount) {
                answer = i;
                break;
            }


        }
        return answer;
    }
}