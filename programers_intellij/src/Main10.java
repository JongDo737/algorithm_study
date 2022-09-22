import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main10 {
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        String s = "baabaa";
        System.out.println(sol.solution(s));
        
    }
}
class Solution10 {
    public int solution(String s) {
        int answer = -1;
        // 스택 이용하기
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if( stack.size()==0){       // 아무것도 없을 때
                stack.push(c);
            }else if(stack.peek()==c){  // 스택의 맨위값과 비교 값이 같으면 제거해준다.
                stack.pop();
            }else{
                stack.push(c);          // 다르면 push
            }
        }

        if(stack.size()>0) {
            return 0;
        }else {
            return 1;
        }
    }
}