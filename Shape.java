 interface Shape  {

    double area();
    double perimeter();
    void setcontourColor(String color);
    void setfillColor(String color);
}
class Circle implements Shape {
    double radius;
    String contourColor;
    String fillColor;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public  void setcontourColor(String color){
        this.contourColor = color;
    }
    public  void setfillColor(String color){
        this.fillColor = color;
    }
    public void printShape(){
        System.out.println("Круг");
        System.out.println("Площадь "+ area());
        System.out.println("Периметр "+ perimeter());
        System.out.println("Цвет заливки "+ fillColor);
        System.out.println("Цвет контура "+ contourColor);
    }
}
class Rectangle implements Shape {
    double width;
    double height;
    String contourColor;
    String fillColor;
    
    public Rectangle(double width,  double height ) {
        this.width = width;
        this.height = height;
    }
    public double perimeter(){
        return 2*(width+height);
    }
    public double area(){
        return width*height;
    }
    public  void setcontourColor(String color){
        this.contourColor = color;
    }
    public  void setfillColor(String color){
        this.fillColor = color;
    }
    public void printShape(){
        System.out.println("Прямоугольник");
        System.out.println("Площадь "+ area());
        System.out.println("Периметр "+ perimeter());
        System.out.println("Цвет заливки "+ fillColor);
        System.out.println("Цвет контура "+ contourColor);
    }
}
class Triangle implements Shape {
    double side_1;
    double side_2;
    double side_3;
    String contourColor;
    String fillColor;
    
    public Triangle(double side_1,  double side_2, double side_3) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }
    public double perimeter(){
        return side_1+side_2+side_3;
    }
    public double area(){
        double a = perimeter()/2;
        return Math.sqrt(a*(a-side_1)*(a-side_2)*(a-side_3));
    }
    public  void setcontourColor(String color){
        this.contourColor = color;
    }
    public  void setfillColor(String color){
        this.fillColor = color;
    }
    public void printShape(){
        System.out.println("Треугольник");
        System.out.println("Площадь "+ area());
        System.out.println("Периметр "+ perimeter());
        System.out.println("Цвет заливки "+ fillColor);
        System.out.println("Цвет контура "+ contourColor);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.setcontourColor("Желтый");
        circle.setfillColor("Желтый");
        circle.printShape();
        
        Rectangle rectangle = new Rectangle(2,3);
        rectangle.setcontourColor("Синий");
        rectangle.setfillColor("Синий");
        rectangle.printShape();
        
        Triangle triangle = new Triangle(4, 3, 5);
        triangle.setcontourColor("Желтый");
        triangle.setfillColor("Желтый");
        triangle.printShape();
    }
}