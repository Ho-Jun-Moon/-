import java.util.Map;
import java.util.HashMap;

public class EmployeeRepository {
    private static final  EmployeeRepository INSTANCE = new EmployeeRepository();
    var employees = new HashMap<String, Employee>();

    private EmployeeRepository(){}

    public static EmployeeRepository getInstance() {
        return INSTANCE;
    }

    public void add(Employee employee) {
        employees.put(employee.getName(), employee);
    }

    public boolean contains(Employee employee) {
        return employees.containsKey(employee.getName());
    }

    public Employee get(Employee employee) {
        return employees.get(employee.getName());
    }
}