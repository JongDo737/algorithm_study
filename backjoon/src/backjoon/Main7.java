package backjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main7 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		//N���� ���� �Է�
		int num = sc.nextInt();
		Set<Integer> seti = new HashSet<Integer>();
		// ���� ����ֱ�
		for (int i = 0; i < num; i++) {
			seti.add(sc.nextInt());
		}
		
		for (Integer i : seti) {
			System.out.println(i);
		}
		sc.close();
	}
}
