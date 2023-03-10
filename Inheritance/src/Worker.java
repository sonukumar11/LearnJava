public class Worker {
    private String name;
    private String dateOfBirth;
    private String endDate;
    
    public Worker(String name , String dateOfBirth , String endDate){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endDate = endDate;
    }

    public int getAge(){
        int dob = Integer.parseInt(dateOfBirth);
        System.out.print("The Age of employee is : " );
        return 2022 - dob;
    }

    public double collectPay(){
        System.out.print("collect Pay Method Invoked... : ");
        return 1000;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
