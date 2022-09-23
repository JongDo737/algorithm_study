public class Main13 {
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        int n = 8;
        int a=4;
        int b = 7;
        System.out.println(sol.solution(n,a,b));

    }
}
class Solution13
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        // 12 34 56 78

        while(true) {
            answer++;
            if(a+1 == b){
                break;
            }
            if(a%2!=0){
                a+=1;
            }if(b%2!=0){
                b+=1;
            }
            a/=2;
            b/=2;
        }

        return answer;
    }
}