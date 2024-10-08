// |            MyRectangle          | //
// | - topLeft: MyPoint              | // 
// | - bottomRight: MyPoint          | //
// | + MyRectangle(MyPoint, MyPoint) | //
// | + getTopLeft(): MyPoint         | //
// | + getBottomRight(): MyPoint     | //
// | + setTopLeft(MyPoint): void     | //
// | + setBottomRight(MyPoint): void | //
// | + getWidth(): int               | //
// | + getHeight(): int              | //
// | + getArea(): int                | //
// | + getPerimeter(): int           | //
// | + toString(): String            | //

package MyRectangle;

public class MyRectangle {
    private MyPoint2 topLeft;
    private MyPoint2 bottomRight;

    public MyRectangle(MyPoint2 topLeft, MyPoint2 bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint2 getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint2 topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint2 getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint2 bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
