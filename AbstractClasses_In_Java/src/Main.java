public class Main{
    public static void main(String [] args){
        System.out.println("Abstract classes and methods in java");
        Dog dog = new Dog("Wolf" , "big" , 100);
        dog.makeNoise();
        doAnimalStuff(dog);
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move(20);
    }
}