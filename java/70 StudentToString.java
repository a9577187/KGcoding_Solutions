package code;
class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		Student s1=new Student("ABC",12);
		System.out.println(s1);
	}
}