public class Account {

    private double balance;
    private String customerName;

    public Account(){
        this("Amit" , 0.0);
        System.out.println("Empty Constructor called...");
    }

   public Account(String customerName , double balance){
        System.out.println("Constructor with parameters called....");
        this.customerName = customerName;
        this.balance = balance;
   }

   public void describeAccountHolder(){
        System.out.println("Name of the Account Holder is : " + customerName);
        System.out.println("Total Balance in the Account is : " + balance);
   }
}
