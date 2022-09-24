public class Main14 {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        int n = 5;
        System.out.println(sol.solution(n));

    }
}
class Solution14 {
    public long solution(int n) {
        long dp[] = new long[2001];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=2000; i++)
            dp[i] = (dp[i-1] + dp[i-2]) %1234567;

        return dp[n];
    }

}