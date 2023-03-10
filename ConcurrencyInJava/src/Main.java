public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("Sonu's Thread");
        anotherThread.start();

//        new Thread(){
//            public void run(){
//                System.out.println("Hello from the Anonymous class thread");
//            }
//        }.start();

//        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.start();
//
//        anotherThread.interrupt();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public  void run(){
                System.out.println("From the runnable anonymous class");
                try{
                    anotherThread.join();
                    System.out.println("Another Thread terminated , now continue execution");
                }catch(InterruptedException e) {
                    System.out.println("my runnable thread was interrupted");
                }
            }
        });
        myRunnableThread.start();
        System.out.println("Hello Again from the main thread");
    }
}