package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main13 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arString = new String[num];
		for (int i = 0; i < num; i++) {
			arString[i] = sc.next();
		}
		Arrays.sort(arString, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// �ܾ��� ���̰� ���� ���
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2); // ���������� ��
				}

				// �ܾ��� ���̰� �ٸ���� �ܾ��� ���� ������ ��

				else {
					return o1.length() - o2.length(); // ���� ����� �ڸ��� �ٲ�
				}

			}
		});
		for (int i = 0; i < arString.length; i++) {
			
			if (i != 0) {
				if (!(arString[i].equals(arString[i - 1]))) {
					System.out.println(arString[i]);
				}
			}
			else {
				System.out.println(arString[i]);
			}
		}

	}
}
