import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] str_char = str.toCharArray();

        for (int i = str_char.length-1; 0<=i; i--)
            System.out.print(str_char[i]);
    }
}