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
		}// �� �ο��� �ɸ��� �ð� �Է�
		
		// ���� ���� �ð��� �ɸ��� �ο��� ���� �����ϰ� �ϸ� ��
		
		Arrays.sort(time);
		
		for(int i=0; i<people; i++) {
			//System.out.println(i + "  "+ time[i]);
			sum+= time[i]*count;
			count--;
		}
		System.out.println(sum);
		

	}

}
