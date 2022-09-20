import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String s= "3people unFollowed me";
        System.out.println(sol.solution(s));






    }
}
class Solution1 {
    public String solution(String s) {
        String answer = "";

        String word = s.toLowerCase();
        boolean spaceCheck = true;
        for(int i=0; i<word.length();i++) {
            if (spaceCheck) {
                answer += (word.charAt(i) + "").toUpperCase();
            } else {
                answer += word.charAt(i);
            }
            if (word.charAt(i) == ' ') {
                spaceCheck = true;
            }else {
                spaceCheck =false;
            }

        }

        return answer;
    }
}
