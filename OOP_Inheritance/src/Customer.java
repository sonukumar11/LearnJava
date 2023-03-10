public class Customer {
    private String name;
    private int creditLimit;
    private String email_address;

    //Creating Constructors

    public Customer(){
        this("Sonu Kumar Das" , 1000000 , "sk1348448@gmail.com");
        System.out.println("Constructor with no arguments called...");
    }

    public Customer(String name , String email){
        this(name , 0 , email);
        System.out.println("Constructor with only two parameters called...");

    }
    public Customer(String name , int creditLimit , String email_address){
            System.out.println("Constructors with Parameters Called....");
            this.name = name;
            this.creditLimit = creditLimit;
            this.email_address = email_address;
    }



    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void describeCustomer(){
        System.out.println("Name of the customer is : " + name);
        System.out.println("Email Address of the customer is : " + email_address);
        System.out.println("Credit Limit of the customer is : " + creditLimit);
    }


}
