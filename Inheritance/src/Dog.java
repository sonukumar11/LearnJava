public class Dog extends  Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt" , "Big" , 50);
    }

    public Dog(String type , double weight ){
        this(type , weight , "perky" , "curled");
    }

    public Dog(String type , double weight , String earShape , String tailShape){
        super(type , (weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large")) , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("Ow woooooo...!");
        }
        super.move("Very Slowly");
        bark();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        if(speed == "slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }

    }

    private void bark(){
        System.out.println("Woof..!");
    }

    private void run(){
        System.out.println("Dog Running..!");
    }

    private void walk(){
        System.out.println("Dog Walking..!");
    }

    private void wagTail(){
        System.out.println("Tail Wagging..!");
    }




}
