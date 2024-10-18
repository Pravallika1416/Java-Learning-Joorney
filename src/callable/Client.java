package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask c=new CallableTask();
        //Callable Cannot Create an object of Thread
        //Callable can be useful onlyy when you have Executable Services.
        ExecutorService executorService= Executors.newFixedThreadPool(4);
      // String s= executorService.submit(c);   throws exception
      //  Future<String> s=executorService.submit(c);
        List<Future<String>> output=new ArrayList<>();
        for(int i=0;i<20;i++){
            output.add(executorService.submit(c));
        }
        output.stream().forEach(data-> {
            try {
                System.out.println(data.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.shutdown();

    }
}

// u and mother is not well
// u are taking mother to hosp
// u dont have any money

// u go to ur friend
// friend does not have money
// u says that take my debit card with u 1111
// right now, the bank is with no money

// parallelism
// u are taking ur mother to hosp with ur friends empty card
// friend is going to another friend and getting some money
// friend submitting money to the bank

// at that time, u need to buy the medicines
// money was not present in the account
// u will wait, till the money is added to the account, so that u can make a txn


// list <string>
// list.get(0);
//list.get(1);

//List<future<String>
// 0 --> thread1 space
// 1 -> string
// 2 --> thread3 space
// 3 --> thread4 space
// 4 --> thread2 space