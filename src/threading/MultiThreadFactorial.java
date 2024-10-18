package threading;

import java.math.BigInteger;

public class MultiThreadFactorial implements Runnable{
    private int num;

    public MultiThreadFactorial(int num) {
        this.num = num;
    }

    //We cant pass num in run as it is type of void ,so create constructor
    @Override
    public void run() {
getFactorial();
    }
 /*   public  int getFactorial(){
        int output=1;
        for(int i=2;i<=this.num;i++){
            output*=i;
        }
        System.out.println("Output :"+this.num+" "+output+Thread.currentThread());
        return output;
    }*/
 public BigInteger getFactorial(){
     BigInteger output=BigInteger.ONE;
     for(int i=2;i<=num;i++){
         output=output.multiply(BigInteger.valueOf(i));
     }
     System.out.println("Output :"+Thread.currentThread());
     return output;
 }
}
