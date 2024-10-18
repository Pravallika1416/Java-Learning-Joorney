package callable;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "I am in Call Method"+Thread.currentThread().getName();
    }
}
