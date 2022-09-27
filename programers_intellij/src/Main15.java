

public class Main15 {
    public static void main(String[] args) {
        int n = 6;
        Main15 sol = new Main15();
        sol.solution(n);
    }
    public int solution(int n) {

        int ans = 0;
        while(n!=1) {
            if(n%2!=0) { //홀 수 일때 4만큼 왔다가
                ans++;
                n--;
            }
            n/=2;
        }
        ans++;
        return ans;
    }
}