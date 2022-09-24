public class Main14 {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        int n = 5;
        System.out.println(sol.solution(n));

    }
}
class Solution14 {
    public long solution(int n) {
        long answer = 0;

        int oneCount = n%2;
        int twoCount = n/2;
        //222
        //1122 4! / 2! *2!
        //1222
        System.out.println(oneCount);
        System.out.println(twoCount);
        while(twoCount!=-1) {
            n= twoCount+oneCount;
            System.out.println("n = "+n);
            answer += factorial(n) / (factorial(oneCount)*factorial(twoCount));
            System.out.println("result : "+factorial(n) / (factorial(oneCount)*factorial(twoCount)));
            System.out.println("answer = "+answer);
            twoCount-=1;
            oneCount+=2;
        }


        return answer;
    }
    public int factorial(int number){
        if(number==1){
            return 1;
        }else if (number == 0){
            return 1;
        }

        return number*factorial(number-1);
    }
}