import java.util.Scanner;
import java.util.ArrayList;



public class AreaCalculator {
    enum Shape2 { TRIANGLE, RECTANGLE, CIRCLE, QUIT }
    public interface Shape {
            int TRIANGLE = 1;
            int RECTANGLE = 2;
            int CIRCLE = 3;
            int QUIT = 4;
            int NOTING = 5;
            int SPACE = 6;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int[] command = getCommand(scanner);
            if (command[0]==Shape.QUIT) {
                System.out.println("BYE");
                break;
            }
            switch (command[0]){
                case Shape.CIRCLE:
                    System.out.printf("Area of Circle: %.2f%n", (double)command[1]*(double)command[1]*Math.PI);
                    break;
                case Shape.RECTANGLE:
                    System.out.printf("Area of Rectangle: %.2f%n", (double)command[1]*(double)command[2]);
                    break;
                case Shape.TRIANGLE:
                    System.out.printf("Area of Triangle: %.2f%n", (double)command[1]*(double)command[2]/(double)2);
                    break;
                default:
                    System.out.print("INVALID\n");
                    break;
            }

        }
    }
    private static int[] getCommand(Scanner scanner){
        int[] result = new int[3];
        String command = scanner.next();
        command = command.toLowerCase();
        if (command.contains("triangle")){
            result[0] = Shape.TRIANGLE;
            result[1] = scanner.nextInt();
            result[2] = scanner.nextInt();
        }
        else if (command.contains("rectangle")){
            result[0] = Shape.RECTANGLE;
            result[1] = scanner.nextInt();
            result[2] = scanner.nextInt();
        }
        else if (command.contains("circle")){
            result[0] = Shape.CIRCLE;
            result[1] = scanner.nextInt();
        }
        else if (command.contains("quit")){
            result[0] = Shape.QUIT;
        }
        else {
            result[0] = Shape.NOTING;
            scanner.nextLine();
        }
        return result;
    }
}