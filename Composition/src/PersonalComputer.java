public class PersonalComputer extends Product{
    private Computercase computercase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PersonalComputer(Computercase computercase , Motherboard motherboard , Monitor monitor,
                                String model , String manufacturer){
        super(model , manufacturer);
        this.computercase = computercase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Computercase getComputercase() {
        return computercase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
