public class MyThread implements Runnable{
    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName() + " Start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " End");
    }
}