import static java.util.stream.Collectors.toList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MapTest {

           public static void main(String[] args) {

                      Scanner sc = new Scanner(System.in);

                      List<String> data = new ArrayList<>();

                      data.add(sc.next());

                      data.add(sc.next());

                      data.add(sc.next());

                      data.add(sc.next());

                      data.add(sc.next());

                      sc.close();

                     

                      List<String> upperStrData = data.stream().map(String::toUpperCase).collect(toList());

                      System.out.println(upperStrData);

           }

}