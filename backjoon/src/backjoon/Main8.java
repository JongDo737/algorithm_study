package backjoon;

import java.util.Scanner;

public class Main8 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// N개의 숫자 입력
		int num = sc.nextInt();
		// 입력받는 숫자를 담는 배열
		int[] nums = new int[num];
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length; j++) {

				if (nums[i] > nums[j]) {
					
					temp = nums[j];
					
					nums[j] = nums[i];
					
					nums[i] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[(nums.length - 1) - i]);
		}
	}
}
