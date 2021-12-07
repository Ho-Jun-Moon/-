
@FunctionalInterface
public interface MyFunction{
    public abstract void run();
    public default void getMyFunction(String str){
        return () -> System.out.println(str + ".run()");
    }
}
