package code;
class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from "+Thread.currentThread().getName());
        }
    }
}

public class Test {
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread();
        HelloThread t2 = new HelloThread();

        t1.start();
        t2.start();
	}
}