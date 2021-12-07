import java.util.Scanner;
import java.util.ArrayList;

public class RowColumnMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        int num = 1;

        int[][] matrix = new int[num1][num2];
        for (int i = 0; i < num1; i++){
            for (int j = 0; j < num2; j++) {
                matrix[i][j] = num;
                System.out.print((j==num2-1)?Integer.toString(num)+"\n":Integer.toString(num)+", ");
                num = num + 1;
            }
        }
    }
}

