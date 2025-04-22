
package com.bookstore.models;


import java.util.List;

public class Order {
    private String orderId;
    private String customerEmail;
    private List<CartItem> items;
    private double total;

    public Order() {}

    public Order(String orderId, String customerEmail, List<CartItem> items, double total) {
        this.orderId = orderId;
        this.customerEmail = customerEmail;
        this.items = items;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

