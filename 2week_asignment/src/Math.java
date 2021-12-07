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
    private static int getSumBetween(start, end){
        int sum = 0;
        for(int i = start; i < end + 1; i++){
            sum += i;
        }
        return sum;
    }
    private static int getProductBetween(start, end){
        int product = 1;
        for(int i = start; i < end + 1; i++){
            sum *= i;
        }
        return product;
    }
}