import ra.Circle;
import ra.Rectangle;
import ra.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle("red", 5, 4);
        Shape shape2 = new Circle("green", 5.4);

        System.out.print("Hình chữ nhất có diện tích là: " + shape1.getArea() + " ");
        shape1.display();
        System.out.println();
        System.out.print("Hình tròn có diện tích là: " + shape2.getArea() + " ");
        shape2.display();
    }
}