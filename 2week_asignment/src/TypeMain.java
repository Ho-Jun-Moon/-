import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args) {
        /* Your code here!*/
        // 스캐너로 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a integer please!");
        String str_num = scanner.nextLine();
        // printType() 호출
        printType(str_num);
        // 형변환 ( String --> int)
        int int_num = Integer.parseInt(str_num);
        printType(int_num);
        // 형변환 ( int --> float)
        float float_num = (float)int_num;
        printType(float_num);
        scanner.close();
    }
    private static void printType(String x) {
        System.out.println(x + " is a string");
    }
    private static void printType(int x) {
        System.out.println(x + " is an int");
    }
    private static void printType(float x) {
        System.out.println(x + " is a float");
    }
}