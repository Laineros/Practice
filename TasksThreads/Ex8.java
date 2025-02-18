package TasksThreads;

public class Ex8 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println(getState());
            }
        };
        thread1.run();
        thread1.start();
        thread1.join();
        thread1.run();
    }
}

class Ex8_2 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (lock) {
                        lock.notifyAll();
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        synchronized (lock) {
            thread.start();
            lock.wait();
            System.out.println(thread.getState());
            lock.notifyAll();
            System.out.println(thread.getState());
        }
    }
}
