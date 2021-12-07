import java.util.Scanner;
import java.util.ArrayList;

public class BooleanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two integers, dividing by empty space.");
        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.printf("Number1 : %d, Number2 : %d\n", num1, num2);
        boolean larger = num1 > num2;
        boolean smaller = num2 > num1;
        boolean equal = num1 == num2;
        System.out.println(larger?"Number1>Number2 ? true":"Number1>Number2 ? false");
        System.out.println(smaller?"Number1<Number2 ? true":"Number1<Number2 ? false");
        System.out.println(equal?"Number1==Number2 ? true":"Number1==Number2 ? false");
    }
}