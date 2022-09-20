
import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        String s = "(()(";
        System.out.println(sol.solution(s));
        
    }
}
class Solution4 {
    boolean solution(String s) {
        boolean answer = true;
        if(s.length()%2 !=0) return false; // 홀수 일 때
        if(s.charAt(0)==')') return false; // 맨 앞에 괄호가 나올 때
        List<String> stack = new ArrayList<>();

        for (int i=0; i<s.length();i++){
            if(s.charAt(i)=='(') {
                stack.add("(");
            }
            else {      // 닫는 괄호가 나올 때
                if(stack.size()==0) return false;
                if(stack.get(stack.size()-1)=="("){
                    stack.remove(stack.size()-1);
                }else return false;

            }
        }
        if(stack.size() != 0) return false;

        return answer;
    }
}
//(가 나오면 stack에 push 하고 )가 나왔을 때 스택에 저장해둔 (를 역순으로 꺼내본다 (pop)