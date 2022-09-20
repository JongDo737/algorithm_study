
public class Main5 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int n = 15;
        System.out.println(sol.solution(n));
        
    }
}
class Solution5 {
    public int solution(int n) {
        int answer = 1;
        if(n==1) return 1;

        for(int i=1; i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum+=j;
                if(sum>n) break;
                if(sum==n) answer++;
            }
        }
        return answer;
    }
}