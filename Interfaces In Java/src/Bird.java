public class Bird extends Animal implements FlightEnabled , Trackable{

    @Override
    public void move(){
        System.out.println("Bird Flap it's Wings");
    }

    @Override
    public void takeOff(){
        System.out.println("Bird has taken off");
    }

    @Override
    public  void land(){
        System.out.println("Bird has landed");
    }

    @Override
    public void fly(){
        System.out.println("Bird is going to fly");
    }

    @Override
    public void track(){
        System.out.println("We are going to track the bird");
    }



}
