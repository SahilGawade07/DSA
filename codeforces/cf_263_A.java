
import java.io.*;
import java.util.Scanner;

public class cf_263_A {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int col = -1, row = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    col = j;
                    row = i;
                    break;
                }
            }
        }

        System.out.println(Math.abs((2 - col)) + Math.abs((2 - row)));
    }
}
