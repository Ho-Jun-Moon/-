import java.util.Locale;
import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two strings~!");
        String str1, str2;
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        System.out.println(str1.equals(str2)?"true":"false");
        System.out.println(str1.equalsIgnoreCase(str2)?"true":"false");
        System.out.println(str1.equals(str2.toLowerCase())?"true":"false");
        System.out.println(str1.replace("easy", "fun").equalsIgnoreCase(str2)?"true":"false");
    }
}