import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력 받기위한 Scanner 호출
        int[][] intArr = {{1,2,3},{4,5,9}};
        // 출력
        for(int i=0; i<intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                System.out.print(intArr[i][j]);
            }
            System.out.println();
        }
        System.out.print(intArr[0][0]+intArr[1][0]);
        System.out.print(intArr[0][1]+intArr[1][1]);
        System.out.print(intArr[0][2]+intArr[1][2]);
    }
}