package code;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
class Student{
	String name;
	int grade;
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
}
public class Test {
	public static void main(String[] args) {
		Queue<Student> set1=new PriorityQueue<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.grade==o2.grade) {
					return 0;
				}
				else if(o1.grade>o2.grade) {
					return -1;
				}
				else {
					return 1;
				}
				
			}
		});
		Student s1=new Student("Abc",90);
		Student s2=new Student("ABc",80);
		Student s3=new Student("ABC",85);
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		System.out.println(set1);
	}
}