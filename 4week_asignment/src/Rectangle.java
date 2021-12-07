import java.util.Scanner;
public class Rectangle {
    private int left_x;
    private int left_y;
    private int right_x;
    private int right_y;

    public Rectangle(Point p1, Point p2) {
        this.left_x = p1.getX(); this.left_y = p1.getY(); this.right_x=p2.getX(); this.right_y=p2.getY();
    }

    public Rectangle(Rectangle rectangle) {
        this.left_x = rectangle.left_x; this.left_y = rectangle.left_y; this.right_x=rectangle.right_x; this.right_y=rectangle.right_y;
    }

    public void moveBy(int x, int y) {
        this.left_x += x; this.right_x += x; this.left_y += y; this.right_y += y;
    }

    public void moveBy(int position) {
        this.left_x +=position;
        this.left_y +=position;
        this.right_x +=position;
        this.right_y +=position;
    }

    @Override
    public String toString() {
        System.out.printf("Rectangle[(%d, %d), (%d, %d)]", this.left_x, this.left_y, this.right_x, this.right_y);
        return "";
    }
}