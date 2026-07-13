public class Student{
    private String name;
    private int rollNumber;
    private double maths;
    private double physics;
    private double chemistry;

    public Student(String name, int rollNumber, double maths, double physics, double chemistry){
        this.name = name;
        this.rollNumber = rollNumber;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }
    public double getTotal(){
        return maths + physics + chemistry;
    }
    public String getName(){return name;}
    public double getAverage(){
        return getTotal()/3.0;
    }
    public String getGrade(){
        if (getAverage() >= 90){
            return "A";
    }   else if(getAverage() >= 75){
            return "B";
    }   else if(getAverage() >= 60){
            return "C";
    }   else if(getAverage() >= 40){
            return "D";
    }   else{
            return "F";
    }
    }
    public String getResult(){
        if(getAverage() >= 40){
            return "PASS";
    }   else{
            return "FAIL";
    }
    }
    public void printReport(){
        System.out.println("---- Report Card ----");
        System.out.println("Name         : " + getName());
        System.out.println("Roll No      : " + rollNumber);
        System.out.println("Maths        : " + maths);
        System.out.println("Physics      : " + physics);
        System.out.println("Chemistry    : " + chemistry);
        System.out.println("Total        : " + getTotal());
        System.out.printf("Average      : %.2f%%\n", getAverage());
        System.out.println("Grade        : " + getGrade());
        System.out.println("Result       : " + getResult());
    } 
}