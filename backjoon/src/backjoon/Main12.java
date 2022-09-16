package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main12 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] point = new int[num][2]; // point[ÁÂÇ¥°³¼ö] [x,yÁÂÇ¥]

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[0].length; j++) {
				point[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(point, new Comparator<int[]>(){

			@Override
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {
					return e1[1] - e2[1];
				}
				else {
					return e1[0] - e2[0];
				}
			}
			
		});
		for(int i = 0; i < num; i++) {
			System.out.println(point[i][0] + " " + point[i][1]);
		}
	}
}
