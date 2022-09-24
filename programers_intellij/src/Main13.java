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
        int answer = 1;
        // 12 34 56 78 99 99 99 99
        //절반보다 클때
        // 작을때
        while(true) {
            a= a/2+ a%2;
            b= b/2 + b%2;
            if(a==b) {
                break;
            }else {
                answer++;
            }
        }
        return answer;
    }
}