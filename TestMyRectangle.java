package MyRectangle;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint2 topLeft = new MyPoint2(5, 9);
        MyPoint2 bottomRight = new MyPoint2(2, 7);

        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println("Rectangle: " + rectangle);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
