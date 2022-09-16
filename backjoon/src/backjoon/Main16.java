package backjoon;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 동전 가치 갯수
		int K = sc.nextInt(); // 가치의 합

		int[] moneyValue = new int[N]; // 동전 가치
		int totalCount = 0;

		for (int i = 0; i < N; i++) {
			moneyValue[i] = sc.nextInt();
		}

		for (int i = N-1; i >= 0; i--) {

			if (K / moneyValue[i] > 0) { // 큰돈의 가치부터 나누어 준다
				totalCount += K / moneyValue[i];
				K = K%moneyValue[i];		
			}
		}
		System.out.println(totalCount);
	}

}
