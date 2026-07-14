public class Shape{
    private String color;
    public Shape(String color){
        this.color = color;
    }
    public String getColor(){ return color; }
    public double getArea(){ return 0.0; }
    public void displayInfo(){
        System.out.printf("Color: %s | Area: %.2f%n", getColor(), getArea());
    }
}