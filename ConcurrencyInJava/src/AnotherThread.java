public class AnotherThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from Thread name : " + currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Another thread woke me up");
            return;
        }

        System.out.println("Three seconds have passed and i am awake");
    }
}
