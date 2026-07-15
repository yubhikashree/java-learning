public class FullTimeEmployee extends Employee implements Payable{
    private double monthlySalary;
    public FullTimeEmployee(String name, int employeeId, String department, double monthlySalary){
        super(name, employeeId, department);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
    @Override
    public String getRole(){
        return "Full time";
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