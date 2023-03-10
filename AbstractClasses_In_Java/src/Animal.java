public abstract class Animal {
    protected  String type;
    private String size;
    private double weight;


    //creating a constructor
    public Animal(String type , String size , double weight)
    {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(int speed);

    public abstract void makeNoise();


    //concrete method in an abstract class
    public String getExplicitType()
    {
        return getClass().getSimpleName() + " " + type;
    }
}
