package act16;

public class Rectangle extends Shape {
    private double lenght;
    private double width;
    
    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }
    
    public double getArea() {
        return lenght * width;
    } 
    
    public double getPerimeter() {
        return 2 * (lenght + width);
    }
}
