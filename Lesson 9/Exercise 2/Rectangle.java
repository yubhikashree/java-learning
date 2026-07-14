public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width*height;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Width: " + width + " | Height: " + height);
    }
}