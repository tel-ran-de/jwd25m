package com.company;


public class Main {

    public static void main(String[] args) {
        Product pr1= new Product("shoes",60.0);
        Product pr2= new Product("shirt",50.0);

        //pr1.sellingPrice=70.5;

        Product[] products = {pr1,pr2, new Product("shirt2",35.5)};
        Product pr3=products[2];
        double sum=0;
        for (int i = 0; i < products.length ; i++) {
            sum+=products[i].getSellingPrice();
            System.out.println(products[i].toString());
        }
        System.out.println("------------------");
        System.out.println("Summa:" +sum );

        //

    }
}
