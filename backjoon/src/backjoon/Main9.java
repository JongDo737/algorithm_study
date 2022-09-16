package backjoon;

import java.util.Scanner;

public class Main9 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// N개의 숫자 입력
		int num = sc.nextInt();
		int[] nums = new int[num];
		
		for(int i=0; i< nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		int temp =0;
		//정렬 오름차순
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]>nums[j]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}				
			}
		}
		
		
		//산술평균
		int result =0;
		for (int i = 0; i < nums.length; i++) {
			result+=nums[i];
		}
		System.out.println(result);
		//중앙값
		System.out.println(nums[(int)nums.length/2+1]);
		//최빈값
		
		//범위
		
		
	}
}
