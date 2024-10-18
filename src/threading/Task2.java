package threading;

public class Task2 extends Thread{
    public void run(){
        System.out.print("Poland"+Thread.currentThread());
    }
}
