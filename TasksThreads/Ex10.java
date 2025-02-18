package TasksThreads;

import java.util.concurrent.ArrayBlockingQueue;

public class Ex10 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> arr = new ArrayBlockingQueue<>(4);
        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    arr.put(++i);
                    System.out.println("Producer added "+i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    Integer i = arr.take();
                    System.out.println("Consumer took "+i);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread1.join(1000);
        thread2.start();
    }
}
