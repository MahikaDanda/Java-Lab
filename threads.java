public class ThreadExample {
    public static void main(String[] args) {
        Thread bmsThread = new Thread(() -> {
            while (true) {
                System.out.println("BMS College of Engineering");
                try {
                    Thread.sleep(10000); // 10 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread cseThread = new Thread(() -> {
            while (true) {
                System.out.println("CSE");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        bmsThread.start();
        cseThread.start();
    }
}
