public abstract class Employee{
    private String name;
    private int employeeId;
    private String department;
    public Employee(String name, int employeeId, String department){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }
    public abstract double calculateSalary();
    public abstract void printPayslip();
    public String getName(){ return name; }
    public int getEmployeeId(){ return employeeId; }
    public String getDepartment(){ return department; }
    public String getRole(){ return "Employee"; }
    public void displayInfo(){
        System.out.println("Name: " + getName() + " | Id: " + getEmployeeId() + " | Department: " + getDepartment() + " | Role: " + getRole());
    }
}