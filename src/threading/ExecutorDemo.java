package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        Task1 t1=new Task1();
        ScheduledExecutorService executorService1=Executors.newScheduledThreadPool(4);
        executorService1.schedule(t1,30,TimeUnit.SECONDS);

        for(int i=0;i<10;i++){
            executorService.submit(t1);//1 task is submitted
        }
        executorService.shutdown();
      //  executorService.shutdownNow();
        executorService.awaitTermination(2,TimeUnit.MINUTES);
        //await Termination will eait at max to the time which is mentioned in timeout.
        //if taks are done before timeout,main will move beforeahead
        System.out.println("I am in Lat Line");
    }

}
