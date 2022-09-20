import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sol.solution(s));

    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arStr = s.split(" ");
        int max = -100000;
        int min = 100000;

        for(int i=0; i<arStr.length; i++) {
            int temp = Integer.parseInt(arStr[i]);
            if(temp >= max) {
                max = temp;
            }
            if(temp <= min) {
                min = temp;
            }
        }
        answer = min + " " +max;



        return answer;
    }
}