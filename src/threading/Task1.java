package threading;

public class Task1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Pravallika "+Thread.currentThread());
    }
}
