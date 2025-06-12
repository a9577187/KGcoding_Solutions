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
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println(t1.getState());
        System.out.println(t2.getState());
	}
}