public class SalariedEmployee extends  Employee{
    private String annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String annualSalary , boolean isRetired , String empId ,
                            String hireDate , String name , String dateOfBirth , String endDate ){
        super(empId , hireDate , name , dateOfBirth , endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        if(isRetired){
            System.out.println("The Worker has already retired..");
        }
        else{
            System.out.println("The Worker has not retired yet...");
        }
    }
}
