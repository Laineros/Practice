package VideoPractice;

public class ThreadEx1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> {
            System.out.println("start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("end");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("End of main");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
