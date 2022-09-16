package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();
		
		int[] time = new int[people];
		int sum = 0;
		int count = people;
		for(int i=0; i<people; i++) {
			time[i] = sc.nextInt();
		}// 각 인원이 걸리는 시간 입력
		
		// 가장 적은 시간이 걸리는 인원을 먼저 인출하게 하면 됌
		
		Arrays.sort(time);
		
		for(int i=0; i<people; i++) {
			//System.out.println(i + "  "+ time[i]);
			sum+= time[i]*count;
			count--;
		}
		System.out.println(sum);
		

	}

}
