package threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialClinet {
    public static void main(String[] args) {
       // List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l=Arrays.asList(10000,20000,30000,40000,50000,60000,70000,80000,90000,10000,110000,120000,130000,140000,150000);
        ;
        // 10 threads are getting intiated
        long startTime=System.currentTimeMillis();
        List<Thread> list=new ArrayList<>();
        l.stream().forEach(item->{
                    MultiThreadFactorial factorial=new MultiThreadFactorial(item);
                    Thread t= new Thread(factorial);
                    t.start();
                   list.add(t);
                //    t.start();
                  //  t.join();
//                    This is incorrect because it negates the benefit of multi-threading. t.join() is called immediately after starting each thread, which means the main thread waits for that single thread to finish before moving to the next one. Essentially, this runs the threads sequentially, and you lose the performance benefit of parallel execution.
//


                }
                );
        list.stream().forEach(item->{
            try {
                item.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        long endtime=System.currentTimeMillis();
        System.out.println("Time Taken"+ (endtime-startTime));

    }
}
// parallel stream vs Mlti threading
//parallel straming: is multi threading only but here we are not asking abot how many threads we want
//        no of cores= no of threads
//        In multhi threading we can decide the number of threads to be their
//task -- 8 threads--8 cores
//i am creating 16 threads manually in that case the core will be move from one thread to another as context switching
// and their are chances that mlti threaded program takes more time than parallel stream program.
