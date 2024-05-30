package org.example;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.setId(1);
        product.setName("laptop");
        product.setPrice(2000);
        product.setDescriptions("asus marka laptop");
        product.setStockAmount(20);
        System.out.println(product.getName());
        ProductManager productManager=new ProductManager();
        productManager.add(product);

        Product product2=new Product(2,"kalem","faber",400,15);
        System.out.println(product2.getStockAmount());
    }
}