package backjoon;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // ���� ��ġ ����
		int K = sc.nextInt(); // ��ġ�� ��

		int[] moneyValue = new int[N]; // ���� ��ġ
		int totalCount = 0;

		for (int i = 0; i < N; i++) {
			moneyValue[i] = sc.nextInt();
		}

		for (int i = N-1; i >= 0; i--) {

			if (K / moneyValue[i] > 0) { // ū���� ��ġ���� ������ �ش�
				totalCount += K / moneyValue[i];
				K = K%moneyValue[i];		
			}
		}
		System.out.println(totalCount);
	}

}
