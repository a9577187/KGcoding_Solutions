package code;

class HelloThread extends Thread {
    public HelloThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        }
    }
}

public class Test {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread("Thread-1");
        HelloThread t2 = new HelloThread("Thread-2");
        HelloThread t3 = new HelloThread("Thread-3");

        System.out.println("\n\n\t" + t1.getName() + "\n\n");
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());

        System.out.println("\n\n\t" + t2.getName() + "\n\n");
        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t2.isAlive());

        System.out.println("\n\n\t" + t3.getName() + "\n\n");
        System.out.println(t3.isAlive());
        t3.start();
        System.out.println(t3.isAlive());
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t3.isAlive());
    }
}
