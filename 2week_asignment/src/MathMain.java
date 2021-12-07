import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a begin number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter am end number: ");
        int num2 = scanner.nextInt();

        long sum = getSumBetween(num1,num2);
        System.out.printf("Sum between %d and %d : %,d%n", num1, num2, sum);

        long product = getProductBetween(num1,num2);
        System.out.printf("Sum between %d and %d : %,d%n", num1, num2, product);
    }
    private static int getSumBetween(int start, int end){
        int sum_num = 0;
        for(int i = start; i < end + 1; i++){
            sum_num = sum_num + i;
        }
        return sum_num;
    }
    private static int getProductBetween(int start, int end){
        int product_num = 1;
        for(int i = start; i < end + 1; i++){
            product_num = product_num * i;
        }
        return product_num;
    }
}