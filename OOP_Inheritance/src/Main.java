public class Main {
    public static void main(String[] args){
//            Car car = new Car();
//            System.out.println("<---------------------------------------->");
//            System.out.println("Make : - " + car.getMake());
//            System.out.println("Model :- " + car.getModel());
//            System.out.println("Color :- " + car.getColor());
//            System.out.println("Doors :- " + car.getDoors());
//            System.out.println("Is Convertible :- " + (car.isConvertible() ? "Yes" : "No"));
//            car.describeCar();
//            System.out.println("<---------------------------------------->");
//
//
//            car.setMake("Porsche");
//            car.setModel("carerra");
//            car.setColor("Red");
//            car.setDoors(2);
//            car.setConvertible(false);
//
//            System.out.println("<---------------------------------------->");
//            System.out.println("Make : - " + car.getMake());
//            System.out.println("Model :- " + car.getModel());
//            System.out.println("Color :- " + car.getColor());
//            System.out.println("Doors :- " + car.getDoors());
//            System.out.println("Is Convertible :- " + (car.isConvertible() ? "Yes" : "No"));
//            car.describeCar();
//            System.out.println("<---------------------------------------->");

//            Account acc1 = new Account();
//            acc1.describeAccountHolder();
//            Account acc2 = new Account("Sonu" , 1000);
//            acc2.describeAccountHolder();

        Customer cust1 = new Customer();
        cust1.describeCustomer();
        System.out.println("<---------------------------------------->");

        Customer cust2 = new Customer("Nipun" , "nipunpra123@gmail.com");
        cust2.describeCustomer();
        System.out.println("<---------------------------------------->");

        Customer cust3 = new Customer("Roshan pandey" , 7000000 ,  "rp345@gmail.com"  );
        cust3.describeCustomer();
    }
}
