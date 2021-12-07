public class Triangle extends Shape{
    private int a, b, c;
    private int s;
    public Triangle(int a, int b, int c){
        this.a = a; this.b = b; this.c = c;
        this.s = (a + b + c)/2;
    }

    @Override
    public double getLength() { return (double)a + (double)b + (double)c; }
    @Override
    public float getArea() { return (float)Math.sqrt(s * (s-a)*(s-b)*(s-c)); }
    @Override
    public void draw() {
        System.out.printf("Triangle, Area: %.2f, Length: %.2f", (double)getArea(), getLength());
    }
}
