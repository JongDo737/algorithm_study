import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력 받기위한 Scanner 호출
        int[][] intArr = new int[3][3];
        int line1Sum = 0;   // 1행 합
        int line2Sum = 0;   // 2행 합
        for(int i=0; i<intArr.length-1; i++) {
            int tempSum = 0;
            for(int j=0; j<intArr[0].length-1;j++) {
                intArr[i][j] = sc.nextInt();            // 0 0, 0 1, 1 0, 1 1 순으로 입력
                tempSum += intArr[i][j];
                if(j == 0) {                    // 1열 일때
                    line1Sum += intArr[i][j];
                }else if (j == 1){              // 2열 일때
                    line2Sum += intArr[i][j];
                }
            }
            intArr[i][2] = tempSum;     //3번째 행은 해당 열의 합
        }
        intArr[2][0] = line1Sum;        // 1행 합
        intArr[2][1] = line2Sum;        // 2행 합
        intArr[2][2] = line1Sum + line2Sum; // 3열의 합


        // 출력

        for(int i=0; i<intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                System.out.print(intArr[i][j]);
            }
            System.out.println();
        }

    }
}