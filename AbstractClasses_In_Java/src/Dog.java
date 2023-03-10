public class Dog extends Animal {


    public Dog(String type , String size , double weight){
        super(type , size , weight);
    }
    @Override
    public void move(int speed) {
        if(speed <= 50){
            System.out.println("Slow");
        }
        else{
            System.out.println("Fats");
        }
    }

    @Override
    public  void makeNoise(){

        if(type == "Wolf"){
            System.out.println(getExplicitType() + "Howling..");
        }
        else{
            System.out.println("Woof Woof..");
        }
    }


}
