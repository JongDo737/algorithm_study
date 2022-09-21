import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(sol.solution(n,words));
        
    }
}
class Solution9 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2]; //[몇번째 사람이, 몇번째 탈락]
        
        List<String> gameWords = new ArrayList<>();
        List<String> deleteWords = new ArrayList<>();

        for(int i=0; i<words.length; i++) {
            gameWords.add(words[i]);
        }
        char endWord = gameWords.get(0).charAt(0);
        for(int i=0; i<gameWords.size(); i++) {
            if(endWord == gameWords.get(i).charAt(0)) {
                if(deleteWords.contains(gameWords.get(i))){     // 이미 말한 단어 얘기했을 때
                    answer[0]=i % n +1;
                    answer[1]=i/n+1;
                    return answer;
                }
                endWord = gameWords.get(i).charAt(gameWords.get(i).length()-1); // 맨 마지막 글자로 초기화
                deleteWords.add(gameWords.get(i));
            }else {
                answer[0]=i % n +1;
                answer[1]=i/n+1;
                return answer;
            }
        }
        answer[0]=0;
        answer[1]=0;

        return answer;
    }
}