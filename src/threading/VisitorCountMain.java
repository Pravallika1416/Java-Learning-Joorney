package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorCountMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        VisitorCount visitorCount=new VisitorCount(0);
        for(int i=0;i<20000000;i++){
executorService.submit(visitorCount);
        }
        executorService.shutdown();
        executorService.awaitTermination(300, TimeUnit.SECONDS);
        System.out.println("People Present in Hall"+visitorCount.getCount());

    }
}
