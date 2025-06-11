package code;
class Vehicle {
	 void service() {
		 System.out.println("Vehicle service");
	 }
}
class Car extends Vehicle{
	String name;
	Car(String name){
		this.name=name;
	}
	void service() {
		super.service();
		System.out.println(this.name+" service");
	}
}
public class Test {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.service();
		Car c1=new Car("BMW");
		c1.service();
	}
}