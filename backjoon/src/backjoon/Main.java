package backjoon;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();
		int restV=V;
		int count=1;
		while(true) {
			
			restV-=A;
			if(restV<=0) {
				break;
			}
			restV+=B;
			count++;
		}
		System.out.println(count);
	}
}
