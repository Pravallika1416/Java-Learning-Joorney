package threading;

import java.util.concurrent.atomic.AtomicInteger;

public class VisitorCount implements Runnable{
    private AtomicInteger count;

    public VisitorCount(int count) {
        this.count = new AtomicInteger(0);
    }

    public int getCount() {
        return count.get();
    }

    @Override
    public void run() {
        // System.out.println("Current Time is "+count);
       // addCount();
     //   count++;
        count.getAndAdd(1);
    }
   // public synchronized void addCount(){
//        count++;
    //}

}
