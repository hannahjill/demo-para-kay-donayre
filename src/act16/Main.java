package act16;

public class Main {
    
    public static void main(String[] args) {
        //create some shapes
        Shape rectangle = new Rectangle(10, 12);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(7, 8, 6);
        
        // calculate area and perimeter of each shape
        System.out.println("\nArea and perimeter of various shapes: ");
        System.out.println("\nRectangle: Lenght-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        
        System.out.println("\nCircle: Radius-5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        
        System.out.println("\nTriangle: Side-7, Side-8, Side-6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        
    }
    
}
