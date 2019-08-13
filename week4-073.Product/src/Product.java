/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ani
 */
public class Product {
    private double price;
    private int amount;
    private String name;
    
    public Product (String nameAtStart, double priceAtStart,
            int amoutAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amoutAtStart;
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price +
                ", amount " + this.amount);
    }
}
