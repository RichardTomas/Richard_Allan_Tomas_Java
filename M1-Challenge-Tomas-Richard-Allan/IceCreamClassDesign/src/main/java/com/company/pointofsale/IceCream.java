package com.company.pointofsale;

public class IceCream {
    private double price;
    private String flavor;
    private int quantity;

    private int orders;

    public IceCream(double price, String flavor, int quantity, int orders) {
        this.price = price;
        this.flavor = flavor;
        this.quantity = quantity;
        this.orders = orders;
    }

    public IceCream(double price, String flavor, int quantity) {
        this.price = price;
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public double singleOrderPrice(){
        double sale = price * quantity;
        return sale;
    }

    public double totalDailySale(){
        double totalSale = price * orders;
        return totalSale;
    }

    public int inventoryAfterSale(){
        int inventory = (quantity * flavor) - orders;
        return inventory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
