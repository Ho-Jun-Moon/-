import java.util.Scanner;
import java.util.ArrayList;



public class SwitchMain2 {
    public interface Command {
        String QUIT = "quit";
        String ADD = "add";
        String PRINT = "print";
        String UNKNOWN = "unknown";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>();
        while (true) {
            String[] command = getCommand(scanner);
            if (command[0]==Command.QUIT) {
                System.out.println("Bye");
                break;
            }
            switch (command[0]){
                case Command.ADD:
                    data.add(command[1]);
                    break;
                case Command.PRINT:
                    System.out.print("[");
                    for (int i = 0; i<data.size()-1; i++){
                        System.out.print(data.get(i)+", ");
                    }
                    System.out.print(data.get(data.size()-1)+"]\n");
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }

        }
    }
    private static String[] getCommand(Scanner scanner){
        String[] result = new String[2];
        String command = scanner.nextLine();
        command = command.toLowerCase();
        command = command.replaceAll(" ", "");
        if (command.contains("add")){
            result[0] = Command.ADD;
            String tmp = command.substring(3, command.length());
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            result[1] = months[Integer.parseInt(tmp)-1];
        }
        else if (command.contains("print")){
            result[0] = Command.PRINT;
        }
        else if (command.contains("quit")){
            result[0] = Command.QUIT;
        }
        else {
            result[0] = Command.UNKNOWN;
        }
        return result;
    }
}