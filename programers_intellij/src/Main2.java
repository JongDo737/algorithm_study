public class Main2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String s= "110010101001";
        System.out.println(sol.solution(s));






    }
}
class Solution2 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        boolean isFinish = false;
        int count =0;
        int countZero = 0;
        while(!isFinish) {
            if(s.length()==1) break;
            int length=0;
            int zeroA = s.length();
            s = s.replace("0","");  // 0 제거
            int zeroB = s.length();
            countZero+=zeroA-zeroB;


            length = s.length();        // 남은 문자열 길이
            s = Integer.toBinaryString(length);
            count++;

        }
        answer[0] = count;
        answer[1] = countZero;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }

}