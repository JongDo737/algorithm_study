package backjoon;

import java.util.Scanner;

public class Main11 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] point = new int[num][2]; // point[ÁÂÇ¥°³¼ö] [x,yÁÂÇ¥]

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[0].length; j++) {
				point[i][j] = sc.nextInt();
			}
		}
		// x°ª Á¤·Ä
		int[] temp = new int[2];
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (point[i][0] > point[j][0]) {

					// x ÁÂÇ¥ y ÁÂÇ¥ ¸ðµÎ ºÁ²ã¾ßÇÏ±â ¶§¹®¿¡ 1Ãþ °ªÀ» ¹Ù²ãÁØ´Ù.

					if (point[i][0] == point[j][0]) { // x ÁÂÇ¥°¡ °°À¸¸é
						if (point[i][1] > point[j][1]) { // y°ª ºñ±³

							temp = point[j];
							point[j] = point[i];
							point[i] = temp;

						}
					}

					temp = point[j];
					point[j] = point[i];
					point[i] = temp;
				}
			}
		}

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				System.out.print(point[point.length - i - 1][j] + " ");
			}
			System.out.println();
		}
	}
}
