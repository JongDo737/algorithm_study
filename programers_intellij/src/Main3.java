
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String s= "110010101001";
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        System.out.println(sol.solution(A,B));

    }
}
class Solution3 {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0 ; i<A.length; i++)  {
            answer+= A[i] * B[B.length-1-i];
        }



        return answer;
    }
}