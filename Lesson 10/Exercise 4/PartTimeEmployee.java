public class PartTimeEmployee extends Employee implements Payable{
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, int employeeId, String department, double hourlyRate, int hoursWorked){
        super(name, employeeId, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
    @Override 
    public String getRole(){
        return "Part time";
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