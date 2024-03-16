package act16;

public class Circle extends Shape {
    
    private double radius;
    
    public Circle(double Radius){
    this.radius = radius;
    }
    
    public double getArea() {
    return Math.PI * radius * radius;
    }
    
    public double getPerimeter() {
    return 2 * Math.PI * radius;
    }
    
}