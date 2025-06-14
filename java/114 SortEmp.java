package code;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Prashant", 100),
            new Employee("Sanchit", 1000),
            new Employee("Ram", 10000),
            new Employee("Shyam", 1),
            new Employee("Mohan", 5)
        );

        employees.stream()
                 .sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
                 .forEach(System.out::println);
    }
}

class Employee {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}    
}
