// |     MyPoint        | //
// | - x: int           | //
// | - y: int           | // 
// | + MyPoint(int, int)| //
// | + getX(): int      | //
// | + getY(): int      | //
// | + setX(int): void  | //
// | + setY(int): void  | // 
// | + toString(): String | //

package MyRectangle;

public class MyPoint2 {
    private int x;
    private int y;

    public MyPoint2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
