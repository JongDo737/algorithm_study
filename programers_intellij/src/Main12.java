import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        int[] people = {2,4,6,14};
        int limit = 100;
        System.out.println(sol.solution(people));
        
    }
}
class Solution12 {
    public int solution(int[] arr) {
        int answer = 0;
        String[] multy = new String[arr.length];
        //소수들을 set에 담아서 다 나눠보고
        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            int divNum = 2;
            while(num==1) {
                
                if(num%divNum)
            }


        }


        return answer;
    }
}
// 1. 소수의 곱으로 나타내기
// 2. 공통되는건  한번만  곱해주기
// 2 . 2*3, 2*2*2, 2*7