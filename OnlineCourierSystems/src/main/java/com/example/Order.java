package com.example;

public class Order {
    private int orderId;
    private String orderDate;
    private String orderStatus;
    private double orderTotal;



    public void checkOrder(){
    
    }

    public void cancelOrder(){

    }

    public void placeOrder(){

    }


    public Order() {}


    public Order(int orderId, String orderDate, String orderStatus, double orderTotal) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderTotal = orderTotal;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}
