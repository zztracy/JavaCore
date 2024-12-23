package thread.createthread;

/**
 * 通过继承Thread类的方式创建线程
 * 1. 继承Thread类
 * 2. 重写run方法
 * 3. 创建自定义Thread类实例，调用start方法
 *
 * @author 詹泽
 * @since 2024/12/23 15:24
 */
public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    @Override
    public void run() {
        System.out.println("Execute custom run method.");
    }
}
