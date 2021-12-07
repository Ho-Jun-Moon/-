public abstract class Shape {
    private int lineColor;

    public int getLineColor(){return lineColor;}
    public void setLineColor(int color) { lineColor = color ; }
    public abstract double getLength();
    public abstract void draw();
    public abstract float getArea();
}
