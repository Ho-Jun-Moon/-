package com.cafe.order;
import java.util.ArrayList;import java.util.List;


public class PickUpFactory {

    class Delivery implements Order.PickUp {

        private String address;

        public Delivery(String address){
            this.address = address;
        }

        @Override
        public void handle(Order o){
            System.out.printf("--- 배달 관리 화면 ---\n배달통으로 주문을 전달합니다!\n배송주소: %s\n", address);
        }
        // your code here

    }

    class DriveThru implements Order.PickUp {

        private String vehicleNumber;

        public DriveThru(String vehicleNumber){
                    this.vehicleNumber = vehicleNumber;
                }
        @Override
                public void handle(Order o){
                    System.out.printf("--- 드라이브 쓰루 화면 ---\n차량번호: %s\n주문하신 음료가 준비 되었습니다!\n",  vehicleNumber);
                }
        // your code here

    }

    class TakeOut implements Order.PickUp {



        @Override
                public void handle(Order o){

                    System.out.print("주문번호: 3\n--- 테이크 아웃 화면 ---\n주문하신 음료가 준비 되었습니다!\n");
                }
        // your code here

    }

    public Order.PickUp makeTakeOut (){

        return new TakeOut();

    }

    public Order.PickUp makeDriveThru (String vehicleNumber){

        return new DriveThru(vehicleNumber);

    }

    public Order.PickUp makeDelivery (String address){

        return new Delivery(address);

    }


}