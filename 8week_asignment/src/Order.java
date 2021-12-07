package com.cafe.order;
import java.util.ArrayList;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    private static int orderCounter = 1;
    private int orderNo ;

    public void addItem(OrderItem item){
        items.add(item);
    }

    public String toString(){
        String result = "[";
        for (int i = 0; i < items.size(); i++){
            result += items[i].toString();
            if (!(i == items.size()-1)) {result += ", ";}
        }
        result += "]";
        return result;
    }

    private Order.PickUp delivery;

        public static interface PickUp {
            	    public abstract void handle(Order o);
         	}
    public void completed(){
        delivery.handle();
    }
    public void setPickUp(Order.PickUp p){
        this.delivery = p;
    }
}


