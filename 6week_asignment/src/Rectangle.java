public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width; this.height = height;
    }

    @Override
    public double getLength() { return (double)width + (double)height; }
    @Override
    public float getArea() { return (float)width * (float)height; }
    @Override
    public void draw() {
        System.out.printf("Rectangle, Area: %.2f, Length: %.2f", (double)getArea(), getLength());
    }
}
