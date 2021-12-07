import static java.util.stream.Collectors.toList;

public class FilterCountDistinctTest {

           public static void main(String[] args) {

                      List<Integer> data = new ArrayList<>();

                      Scanner sc = new Scanner(System.in);

                      for (int i = 0; i < 10; i++) {

                                 data.add(sc.nextInt());

                      }

                      sc.close();

                      System.out.println(data.stream().filter(i -> i < 10));

                      System.out.println(data.stream().filter(i -> i < 10).count());

                      System.out.println(data.stream().filter(i -> i < 10).distinct());



                      System.out.println(data.stream().filter(i -> i >= 10));

                      System.out.println(data.stream().filter(i -> i >= 10).count());

                      System.out.println(data.stream().filter(i -> i >= 10).distinct());
           }

}