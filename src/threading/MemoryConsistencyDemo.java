package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MemoryConsistencyDemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);

        TaskMemoryConsIssue t=new TaskMemoryConsIssue("W");
        TaskMemoryConsIssue r=new TaskMemoryConsIssue("R");
        executorService.submit(t);
        executorService.submit(r);
        executorService.shutdown();

    }
}
