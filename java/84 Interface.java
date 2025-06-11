package code;
interface Flyable{
	void fly();
}
abstract class Bird implements Flyable{
	//public abstract void fly();//no need
	void sound() {
		System.out.println("ki...ki...ki...");
	}
}
class Eagle extends Bird{
	int speed;
	
	public Eagle(int speed) {
		this.speed = speed;
	}

	@Override
	public void fly() {
		System.out.println("Eagle flies at "+speed);
	}
	
}
public class Test {
	public static void main(String[] args) {
		Eagle goldenEagle = new Eagle(120);

        goldenEagle.fly();
        goldenEagle.sound();


        Flyable flyingObject = new Eagle(100);
        flyingObject.fly();

        Bird wildBird = new Eagle(90);
        wildBird.fly();
        wildBird.sound();
	}
}