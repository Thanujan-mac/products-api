package uk.ac.westminster.products_api2;

public class Product {
    private String name;
    private double price;

    // Getters and Setters are required for Spring to map the data
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}