package org.example;

public class Product {
    public int getId() {
        return id;
    }

    public Product() {
    }

    public Product(int id, String name, String descriptions, double price, int stockAmount) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    private int id;
    private String name;
    private String descriptions;
    private double price;
    private int stockAmount;
}
