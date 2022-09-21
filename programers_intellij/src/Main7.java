import java.math.BigInteger;

public class Main7 {
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int n = 100;
        System.out.println(sol.solution(n));
        
    }
}
class Solution6 {
    public int solution(int n) {
        int answer = 0;
        // n 번째 피보나치 수열을 파악해야함 0,1,1,2,3,5,8...
        BigInteger left = new BigInteger("0");
        BigInteger right = new BigInteger("1");
        for(int i=0; i<n-1; i++){
            BigInteger temp = left;
            left = right;
            right = right.add(temp);
        }
        right = right.remainder(BigInteger.valueOf(1234567));
        answer= right.intValue();


        return answer;
    }
}