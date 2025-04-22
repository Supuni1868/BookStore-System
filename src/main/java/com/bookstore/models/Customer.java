/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.models;



import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String email;
    private String name;
    private String password;
    private List<CartItem> cartItems = new ArrayList<>();

    public Customer() {}

    public Customer(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.cartItems = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void addToCart(CartItem item) {
        this.cartItems.add(item);
    }

    public void removeFromCart(String isbn) {
        cartItems.removeIf(item -> item.getIsbn().equals(isbn));
    }

    public void clearCart() {
        cartItems.clear();
    }
}
