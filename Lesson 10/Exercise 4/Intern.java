public class Intern extends Employee implements Payable{
    private double stipend;
    public Intern(String name, int employeeId, String department, double stipend){
        super(name, employeeId, department);
        this.stipend = stipend;
    }
    @Override
    public double calculateSalary(){
        return stipend;
    }
    @Override
    public String getRole(){
        return "Intern";
    }
    @Override
    public void printPayslip(){
        System.out.println("--- Payslip ---");
        System.out.println("Name       : " + getName());
        System.out.println("ID         : " + getEmployeeId());
        System.out.println("Department : " + getDepartment());
        System.out.println("Role       : " + getRole());
        System.out.println("Salary     : Rs. " + calculateSalary());
    }
}