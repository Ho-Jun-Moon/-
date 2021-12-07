import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();

        if (num%2==0 && num%3==0){
            System.out.printf("%d is a multiple of 2 and 3", num);
        }
        else if (num%2==0) {
            System.out.printf("%d is a multiple of 2", num);
        }
        else if (num%3==0) {
            System.out.printf("%d is a multiple of 3", num);
        }
        else {
            System.out.printf("%d is not a multiple of 2 and 3", num);
        }
    }
}

