package code;
class Employee{
	private String name;
	private int age;
	private double salary;
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
	
public class Test {
	public static void main(String[] args) {
		Employee employee1 = new Employee("John Doe", 30, 60000.00);
        System.out.println("Initial Employee 1 Details: " + employee1.toString());

        Employee employee2 = new Employee("Jane Smith", 25, 55000.50);
        System.out.println("Initial Employee 2 Details: " + employee2.toString());


        employee1.setSalary(65000.75);
        System.out.println("Employee 1's Updated Salary: $" + employee1.getSalary());

        employee2.setAge(26);
        employee2.setName("Janet Smith");
        System.out.println("Employee 2's Updated Details: " + employee2);

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);
	}
}