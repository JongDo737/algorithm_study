import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        System.out.println(Solution16.changeString("I love you-"));
    }
}
class Solution16 {
    public static String changeString(String word) {
        //A65 Z90 a97 z122 17
        // word + (평균 - word)*2
        String answer = "";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i));
            if (word.charAt(i) <= 90 && word.charAt(i) >= 65) {  //대문자
                answer += (char) (word.charAt(i) + 2 * (77 - word.charAt(i)) + 1) + "";
            } else if(word.charAt(i) <= 122 && word.charAt(i) >= 17) {

                answer += (char) (word.charAt(i) + 2 * (109 - word.charAt(i)) + 1) + "";
            }else {
                answer += word.substring(i);
            }
        }
        return answer;
    }
}