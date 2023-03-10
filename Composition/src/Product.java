public class Product {
    private String model;
    private String manufacturer;
    private String height;
    private String width;
    private String depth;


    public Product(String model , String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;


    public  Monitor(int size , String resolution , String model , String manufacturer){
        super(model , manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public Monitor(String model  , String manufacturer){
        super(model , manufacturer);
    }

    public void drawPixelAt(int x , int y , String color){
        System.out.println(String.format("Drwaing pixel at %d %d in color %s" , x , y , color));
    }
}

class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(int ramSlots , int cardSlots , String bios,
                            String model , String manufacturer){
        super(model , manufacturer);
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }
    public Motherboard(String model  , String manufacturer){
        super(model , manufacturer);
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is Loading....");
    }
}

class Computercase extends Product{
    private String powerSupply;

    public Computercase(String powerSupply , String model , String manufacturer){
        super(model , manufacturer);
        this.powerSupply = powerSupply;
    }
    public Computercase(String model , String manufacturer){
        super(model , manufacturer);
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed...");
    }
}




