package multithreading;

public class MultithreadingInterface implements Runnable {

	@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        MultithreadingInterface mi = new MultithreadingInterface();

        Thread t1 = new Thread(mi);
        t1.start();
    }

}
