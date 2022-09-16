package backjoon;

import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.next().split("-");
		int total = 0;
		int[] sum = new int[input.length];
		for(int i=0 ;i<input.length; i++) {
			String[] addition = input[i].split("\\+");
			for(int j=0; j<addition.length; j++) {
				sum[i]+= Integer.parseInt(addition[j]);
			}
		}
		total = sum[0];
		for(int i=1; i<sum.length; i++ ) {
			
			total -= sum[i];
			
		}
		
		
		System.out.println(total);
	}
}
