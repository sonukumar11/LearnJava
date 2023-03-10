public class Fish extends  Animal{
    private int finns;
    private int gills;

    public Fish(String type,  double weight, int finns, int gills) {
        super(type, "small" , weight);
        this.finns = finns;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.println("Muscle Moving........!");
    }

    private void moveBackFin(){
        System.out.println("BackFin Moving........!");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }

    }

    @Override
    public String toString() {
        return "Fish{" +
                "finns=" + finns +
                ", gills=" + gills +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
