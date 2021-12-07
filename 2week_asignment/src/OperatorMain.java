import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two integers, dividing by empty space.");
        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        float result = (float)num1/(float)num2;
        float r = (float)num1%(float)num2;
        int q = (int)result;
        System.out.printf("%d/%d=%.3f\n", num1, num2, result);
        System.out.printf("%d = %dX%d+%d\n", num1, q, num2, (r==0)?0:1);
    }
}