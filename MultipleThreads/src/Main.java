public class Main {
    public static void main(String[] args) {

        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");

        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}


class Countdown{
    private int i;
    public synchronized void doCountdown() {
        String color;

        switch(Thread.currentThread().getName()){
            case "Thread 1":
                color = "Thread 1 color";
                break;
            case "Thread 2":
                color = "Thread 2 color";
                break;
            default:
                color = "Any Thread Color";
        }

        synchronized (this){
            for(i=10;i>0;i--){
                System.out.println(color + "i = " + i);
            }
        }
    }
}

class CountdownThread extends Thread{
    private Countdown threadCountDown;

    public CountdownThread(Countdown countdown){
        threadCountDown = countdown;
    }

    @Override
    public void run(){
        threadCountDown.doCountdown();
    }
}