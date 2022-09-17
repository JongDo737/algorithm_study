package level2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(sol.solution(s));

	}

}

class Solution1 {
    public String solution(String s) {
        String answer = "";
        
		String[] arr = s.split(" "); // 공백으로 구분
		int[] numArr = new int[arr.length];
		int max = -10000000;
		int min = 10000000;
		for(int i=0; i< numArr.length; i++) {
			numArr[i] = Integer.parseInt(arr[i]);
			if(numArr[i]>max) max = numArr[i];
			if(numArr[i]<min) min = numArr[i];
		}
		answer = min +" "+max;
        
        return answer;
    }
}