import java.util.Scanner;

enum Command { ADD, LIST, SUM, QUIT, INVALID, MAX, MIN }

public class ArrayEnum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int[] values = new int[100];
        int index = 0;

        while (true){
            final Command command = getCommand(scanner);
            System.out.print(command);
            if (command==Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch ( command ) {
            case Command.ADD:
                final int newValue = getValue(scanner);
                values[index] = newValue;
                index++;
                break;
            case Command.LIST:
                printList(values, index);
                break;
            case Command.SUM:
                System.out.println(getSum(values, index));
                break;
            case Command.MAX:
                System.out.println(getMax(values));
                break;
            case Command.MIN:
                System.out.println(getMin(values));
                break;
            default:
                System.out.println("Invalid Command");
                break;
            }
    }
    }
    private static enum getCommand(Scanner scanner){
        String command = scanner.next();
        command = command.toLowerCase();
        switch(command) {
        case "add":
            return Command.ADD;
            break;
        case "list":
            return Command.LIST;
            break;
        case "sum":
            return Command.SUM;
            break;
        case "quit":
            return Command.QUIT;
            break;
        case "max":
            return Command.MAX;
            break;
        case "min":
            return Command.MIN;
            break;
        default:
            return Command.INVALID;
            break;
        }
    }
    private static Command getValue(Scanner scanner){
         return scanner.nextInt();
    }
    private static String getSum(int[] values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return Integer.toString(sum);
    }
    private static String getSum(int[] values){
            int max = values[0];
            for (int value : values) {
                if (value > max)
                    max = value;
            }
            return Integer.toString(max);
    }
    private static String getSum(int[] values){
                int max = values[0];
                for (int value : values) {
                    if (value > max)
                        max = value;
                }
                return Integer.toString(max);
        }
}
}