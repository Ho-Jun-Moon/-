public class NumberRepository {
    private List<Number> data = new ArrayList<>();
    private static NumberRepository instance = new NumberRepository();

    public static NumberRepository getInstance() {
        return instance;
    }

    public void addAll(List<? extends Number> numbers){
        for(<? extends Number> i: numbers){
            this.data.add((Number)i);
        }
    }

    public String toString(){
        return data.toString();
    }
}