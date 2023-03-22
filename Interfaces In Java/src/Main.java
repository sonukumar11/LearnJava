public class Main {
    public static void main(String[] args) {

        Bird flier = new Bird();

        flier.fly();
        flier.land();
        flier.takeOff();
        flier.track();

        int kmsTravelled = 100;

        System.out.println("Distance Travelled in miles equals " + kmsTravelled * FlightEnabled.KM_TO_MILES);
    }
}