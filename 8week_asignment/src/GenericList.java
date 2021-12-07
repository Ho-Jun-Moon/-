package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;
    private int count = 0;

    public GenericList(){
            this.size = DEFAULT_SIZE;
            this.data = new Object[size];
        }

    public GenericList(int size){
        this.size = size;
        this.data = new Object[size];
    }
    public void add(T student){
        data[count] = student;
        count++;
    }
    public T get(int i){
        return (T)data[i];
    }

    public void FIND(){

    }

    public void QUIT(){

    }
    public void LIST(){

    }


}
