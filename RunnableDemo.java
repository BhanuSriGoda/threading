import java.util.*;
class RunnableDemo  implements Runnable{
    public void run()
        {
            System.out.println(Thread.currentThread().getName());
        }
    public static void main(String[] args) {
        RunnableDemo demo=new RunnableDemo();

        System.out.println("Main Thread "+Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableDemo());
        t1.start();
    }
}
