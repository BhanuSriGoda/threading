import java.util.*;
class ThreadDemo extends Thread{
    public void run()
    {
        System.out.println("current Thread: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ThreadDemo t1=new ThreadDemo();
        t1.start();
        System.out.println("current Thread: "+Thread.currentThread().getName());

        

    }
}