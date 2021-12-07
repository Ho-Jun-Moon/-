import java.util.Scanner;

class Triangle {
    private final int base;
    private final int height;

    public Triangle(int base, int height){
        this.base = base; this.height=height;
    }
    public double getArea(){
        return (double)this.base * (double)this.height / 2;
    }
    public String toString(){
        return String.format("Triangle [base=%d, height=%d, area=%.2f]", this.base, this.height, getArea());
    }
    //Your code here (생성자, getArea(), toString() 메서드 정의)
}
public class TriangleTest {
        public static void main(String[] args) {
                //Your code here (표준 입력을 받아 N개의 삼각형을 생성하고, 밑변, 높이, 넓이를 출력하시오)
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            Triangle[] array = new Triangle[10];
            for (int i = 0; i < num ; i++){
                int base = scanner.nextInt();
                int height = scanner.nextInt();
                array[i] = new Triangle(base, height);
            }
            for (int i = 0; i < num ; i++){
                System.out.println(array[i].toString());
            }
        }
}
