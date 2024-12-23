package thread.createthread;

/**
 * 通过实现Runnable接口的方式来创建线程
 * 1. 创建一个Runnable接口的实现类
 * 2. 重新Runnable接口的run方法
 * 3. 创建自定义Runnable实现类的实例，并将该实例传入到创建Thread实例的构造函数中
 *
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
