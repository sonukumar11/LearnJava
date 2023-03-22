interface FlightEnabled{

        double MILES_TO_KM = 1.60934;

        double KM_TO_MILES = 0.621371;

        void takeOff();

        void land();

        void fly();

        default void transition(int val){
                System.out.println("Default method is called on interface");
        }

}

interface Trackable{

        void track();

}


public abstract class Animal {

        public abstract void move();

}
