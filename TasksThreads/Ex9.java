package TasksThreads;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread() {
            @Override
            public void run() {

            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println(getName());
            }
        };
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
