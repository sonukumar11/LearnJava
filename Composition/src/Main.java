public class Main {
    public static void main(String[] args){
        Computercase theCase = new Computercase("240" , "2208" , "Dell");
        Monitor theMonitor = new Monitor(27  , "2540 X 1440" , "27inch Beast" ,
                                "Acer");
        Motherboard theMotherboard = new Motherboard(4 ,6, "v2.44" ,
                                                    "BJ - 200" , "Asus");

        PersonalComputer thePC = new PersonalComputer(theCase , theMotherboard , theMonitor ,
                                                    "2208" , "Dell" );

        thePC.getMonitor().drawPixelAt(10 , 10 , "Red");
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputercase().pressPowerButton();
    }
}
