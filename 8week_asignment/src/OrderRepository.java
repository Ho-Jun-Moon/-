package com.cafe.order;
import java.util.ArrayList;import java.util.List;
import java.util.Iterator;

public class OrderRepository implements Iterator<Order>{
     List<Order> orders = new ArrayList<>();
     private int count = 0;
     private int max = 0;

    public void add(Order newOrder){
        orders.add(newOrder);
        max  += 1;
    }

    public boolean hasNext(){
        if (count < max) {
            return true;
        }
        return false;
    }

    public Order next(){
        if (count < max) {
            count +=1;
            return orders.get(count-1);
        }
        return null;
    }
    @Override
    public String toString(){
        String result = String.format("--- 주문 관리자 화면 ---\n현재 주문수는 총 %d 입니다.\n", max);
        result += "\n< 주문 내역 >\n";
        for (Order o : orders){
            result += String.format("주문번호: %d - ");
            result += o.toString();
        }
        result += "\n";
        return result;
    }
}
