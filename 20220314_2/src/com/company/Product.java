package com.company;

public class Product {
    private String name;
    private double sellingPrice;
    private double tax=19;

    public Product(String name, double sellingPrice){
        this.name=name;
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice() {   // getter
        return sellingPrice + sellingPrice*tax/100;
    }

    public String toString(){
        return this.name + " "+this.sellingPrice + " " + this.tax;
    }

 // setter Java
}
