package MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 4);
        MyPoint p2 = new MyPoint(5, 7);

        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        // Create MyLine using coordinates //
        MyLine line2 = new MyLine(0, 0, 5, 7);
        System.out.println(line2);
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());
    }
}
