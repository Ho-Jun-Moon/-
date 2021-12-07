public class MyArrayList<T> {

           private T[] data;
           private int max;
           private int capacity;
           public MyArrayList(int capacity) {
                if (capacity > 0){
                    this.data = new Object[capacity];
                    this.max = 0;
                    this.capacity =capacity;
                }

           }

          

           public void add(T data) {
                if (max < capacity){
                    this.data[max] = data;
                                    max +=1;
                }

           }

          

           public T get(int index) {
                return (T)data[index];
           }

}