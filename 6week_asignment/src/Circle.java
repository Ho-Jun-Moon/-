public class Circle extends Shape{
    private  int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getLength() { return (double)radius*(double)2*(double)Math.PI; }
    @Override
    public float getArea() { return (float)radius*(float)radius*(float)Math.PI; }
    @Override
    public void draw() {
        System.out.printf("Circle, Area: %.2f, Length: %.2f", (double)getArea(), getLength());
    }
}
