package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String nums = sc.next();
		int length = nums.length();
		
		char[] arNum = new char[length];
		
		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = nums.charAt(i);
		}
		Arrays.sort(arNum);
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(arNum[arNum.length-i-1]);
		}
		
		
	}
}
