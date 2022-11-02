public class Main19 {
    public static void main(String[] args) {
        System.out.println(Problem2.solution("browoanoommmnaon"));
    }
}


class Problem2 {
    public static String solution(String cryptogram) {
        Problem2 problem2 = new Problem2();
        String answer = "answer";
        boolean isOK = true;
        while(isOK){
            int length = cryptogram.length();
            for(int i=0; i< cryptogram.length()-1; i++) {
                String sameWords = problem2.sameWord(cryptogram);
                cryptogram=cryptogram.replace(sameWords,"");  // 같은 문자 나왔을 때 없애줌
                i -= 1;     // 없애줬으니 1칸 뒤로
                System.out.println(cryptogram);
                break;
            }
            if(length == cryptogram.length()) break;            // 처음 문자와 길이가 같다 => 변화가 없다 => 암호 해독 끝났다
        }

        answer = cryptogram;
        return answer;
    }
    // 같은 문자가 연속되는 문자열을 검출해서 반환해주는 역할
    public String sameWord(String words) {
        boolean check = true;

        for(int i=0; i<words.length()-1; i++) {
            String temp = (char)words.charAt(i)+"";
            int count = 0;
            check = true;
            while(check) {
                String tempBefore = temp;
                temp += words.charAt(i) + "";
                System.out.println(temp);
                if(words.contains(temp)) {
                    check = true;
                    count++;
                }
                if(!words.contains(temp) && count >0) {
                    System.out.println("연속 문자 : " +temp);
                    return tempBefore;

                }
                if(!words.contains(temp) && count==0) {
                    System.out.println("여기");
                    check = false;
                }

            }
        }
        return "";
    }
}
