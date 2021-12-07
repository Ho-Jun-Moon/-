public class Employee {
    private final String name;
    private final Double salary;
    public Employee(String name, Double salary){
        this.name = name; this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.1f", this.name, this.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this ==  o) return true;
        if (!(o instanceof Employee)) return false;
        if (getClass() != o.getClass()) return false;
        Employee e = (Employee) o;
        return name.equals(e.name)&&this.salary==e.salary;
    }


    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + Double.valueOf(this.salary).hashCode();
        return result;
    }

}