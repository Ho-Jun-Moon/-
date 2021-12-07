import java.util.*;
import java.lang.reflect.*;
import java.lang.Class;

public class ReflectionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg1 = sc.next();
        Double arg2 = sc.nextDouble();
        sc.close();

        String className = "Employee";
        Class[] cArgs = new Class[2];
        cArgs[0] = String.class;
        cArgs[1] = Double.class;

        Employee employee1 = null;
        try {
            Class<?> EmployeeClass = Class.forName(className);
            Constructor<?> EmployeeConstructor = EmployeeClass.getConstructor(cArgs);
            employee1= (Employee)Constructor.newInstance(arg1, arg2);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(employee1);
    }
}