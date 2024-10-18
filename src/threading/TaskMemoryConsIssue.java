package threading;

public class TaskMemoryConsIssue implements Runnable{
    private String type;
   volatile static int data=0;
   // The volatile keyword in Java is used to ensure that updates to a variable are visible to all threads, and it prevents threads from caching a variable's value locally. When a variable is declared volatile, its value is always read from and written directly to the main memory, rather than relying on thread-local caches.
    public TaskMemoryConsIssue(String type) {
        this.type = type;
    }

    @Override
    public void run() {
if(type.equalsIgnoreCase("W")){
    while (data!=5)
    {
        data++;
        System.out.println("Written Data :"+data);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
else{
    int temp=0;
    while(true){
        if(temp!=data){
            System.out.println("Read Data"+temp);
            temp=data;
        }
    }
}
    }
}
