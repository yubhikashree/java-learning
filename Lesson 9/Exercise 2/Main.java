public class Main{
    public static void main(String[] args){
        Circle c = new Circle("Red",5.0);
        Rectangle r = new Rectangle("Blue",6.0,4.0);
        Shape[] shapes = {c,r};
        for(Shape shape : shapes){
            shape.displayInfo();
        }
    }
}