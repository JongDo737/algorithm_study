public class Main14 {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        int n = 5;
        System.out.println(sol.solution(n));

    }
}
class Solution14 {
    public long solution(int n) {
        long answer = 0;
        // 피보나치 수열을 구하면 된다.
        // 1 = 1
        // 2 = 2
        // 3 = 3
        // 4 = 5
        // 5 = 8

        return pibo(n);
    }
    public int pibo(int number){
        if(number <=1) {
            return number;
        }else {
            return pibo(number-1)%1234567+pibo(number-2)%1234567;
        }

    }
}