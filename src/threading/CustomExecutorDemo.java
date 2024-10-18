package threading;

//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//
//public class CustomExecutorDemo {
//    public static void main(String[] args) {
//        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,9,60,TimeUnit.SECONDS,new ArrayBlockingQueue<>(2));
//
//Task1 t=new Task1();
//for(int i=0;i<100;i++)
//{
//    executor.submit(t);
//}
//executor.shutdown();
//    }
//}


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class CachedThreadPoolExample {
public class CustomExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        // Create a cached thread pool
        ExecutorService executor = Executors.newCachedThreadPool();

        // Submit a burst of tasks
        for (int i = 0; i < 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Executing Task " + taskNumber + " on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);  // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Let the threads finish
        Thread.sleep(4000);

        System.out.println("Submitting more tasks...");

        // Submit another burst of tasks
        for (int i = 5; i < 10; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Executing Task " + taskNumber + " on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);  // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shutdown the executor service
        executor.shutdown();
    }
}
