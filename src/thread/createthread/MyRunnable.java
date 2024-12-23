package thread.createthread;

/**
 * @author 詹泽
 * @since 2024/12/23 15:27
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Execute custom run method by implement Runnable Interface.");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
