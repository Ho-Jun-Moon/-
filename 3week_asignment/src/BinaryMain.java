import java.util.Scanner;
import java.util.ArrayList;

public class BinaryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        ArrayList<Character> result = new ArrayList<Character>();
        int i = 0;

        while (num >= Math.pow(2,i)) {
            boolean remainder = (num % Math.pow(2,i+1)) >= Math.pow(2,i);
            if (remainder){
                result.add('1');
            }
            else {
                result.add('0');
            }
            i = i + 1;
        }

        System.out.printf("Number %d in Binary Number : ", num);

        for (i = result.size()-1; 0 <= i ; i --)
            System.out.print(result.get(i));
    }
}