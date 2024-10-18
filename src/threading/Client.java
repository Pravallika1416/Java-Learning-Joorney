package threading;

public class Client {
    public static void main(String[] args) {
        Task1 task =new Task1();
        Thread t= new Thread(task);
        t.start();
        Task2 t2=new Task2();
        t2.start();
       // System.out.print(Runtime.getRuntime().availableProcessors());
    }
}
