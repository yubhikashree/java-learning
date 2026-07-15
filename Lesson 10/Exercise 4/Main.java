public class Main{
    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee("Yubhi",1001,"Engineering",75000.0);
        Employee e2 = new FullTimeEmployee("Manjula",1002,"Physics",80000.0);
        Employee e3 = new PartTimeEmployee("Arun",1003,"Phisical Education",1000.0,6);
        Employee e4 = new Intern("Ohm",1004,"ECE",15000.0);
        Employee[] employees = {e1,e2,e3,e4};
        double totalExpense = 0.0;
        for (Employee employee : employees){
            employee.printPayslip();
            totalExpense = totalExpense + employee.calculateSalary();
        }
        System.out.println("Total salary expense: Rs. " + totalExpense);
    }
}