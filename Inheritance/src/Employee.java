public class Employee extends  Worker{
    private String empId;
    private String hireDate;

    public Employee(String empId , String hireDate , String name , String dateOfBirth , String endDate){
        super(name , dateOfBirth , endDate);
        this.empId = empId;
        this.hireDate = hireDate;
    }
}
