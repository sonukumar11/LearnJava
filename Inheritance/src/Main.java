public class Main {
    public static void main(String[] args){
        Dog yorkie = new Dog("Yorkie" , 15);
        doAnimalStuff(yorkie , "Fast");

        Dog retriever = new Dog("Labrador Retriever" , 65 , "Floppy" , "swimmer");
        doAnimalStuff(retriever , "Slow");

        Dog wolf = new Dog("Wolf" , 40);
        doAnimalStuff(wolf , "slow");

        Fish goldie = new Fish("goldfish" , 0.25 , 2 ,3);
        doAnimalStuff(goldie , "fast");

        SalariedEmployee sonu = new SalariedEmployee("180000000" , false , "1001" ,
                "15th July 2023" , "Sonu Kumar Das" , "2002" , "2050");
        sonu.retire();

        System.out.println(sonu.getAge());

        System.out.println(sonu.collectPay());
    }

    public static void doAnimalStuff(Animal animal , String speed ){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("<---------------->");
    }
}
