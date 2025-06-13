package code;
enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMillis;

    TrafficColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }
}
public class Test {
	static class TrafficLightThread extends Thread {
        private final TrafficColor color;

        public TrafficLightThread(TrafficColor color) {
            this.color = color;
        }

        @Override
        public void run() {
            System.out.printf("%s active\n", color);
            try {
                Thread.sleep(color.getOnTimeInMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%s inactive\n", color);
        }
    public static void main(String[] args) throws InterruptedException {
    	TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
    }
}
}