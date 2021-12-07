
public class MyThread extends Thread {
    public void start() {
        System.out.println("MyThread starts...");
    }
    public void join() {
        System.out.println("MyThread ends...");
    }
}
