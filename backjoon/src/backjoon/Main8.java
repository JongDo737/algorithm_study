package backjoon;

import java.util.Scanner;

public class Main8 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// N���� ���� �Է�
		int num = sc.nextInt();
		// �Է¹޴� ���ڸ� ��� �迭
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
