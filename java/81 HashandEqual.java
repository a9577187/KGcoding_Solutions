package code;
import java.util.*;
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return this.name==other.name && this.age==other.age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.age);
	}
}
public class Test {
	public static void main(String[] args) {
		Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);
        Person person4 = new Person("Alice", 35);
        System.out.println("person1.equals(person2): " + person1.equals(person2));

        System.out.println("person1.equals(person3): " + person1.equals(person3));

        System.out.println("person1.equals(person4): " + person1.equals(person4));

        System.out.println("person1.equals(person1): " + person1.equals(person1));
        
        Object someObject = new Object();
        System.out.println("person1 hash code: " + person1.hashCode());
        System.out.println("person2 hash code: " + person2.hashCode());

        System.out.println("person3 hash code: " + person3.hashCode());
        System.out.println("person4 hash code: " + person4.hashCode());
	}
}