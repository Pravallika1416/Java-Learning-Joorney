package threading;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryImpl implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r){
        return new Thread(r);
    }

    public static void main(String[] args) {
        ThreadFactoryImpl demo=new ThreadFactoryImpl();
        Task1 task1=new Task1();
        Thread t1=demo.newThread(task1);
        t1.start();
        Task2 task2=new Task2();
        Thread t2=demo.newThread(task2);
        t2.start();

    }
}
