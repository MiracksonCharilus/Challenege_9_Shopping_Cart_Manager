package domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Cristy
 */
public class ItemToPurchase {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase(String itemName, double itemPrice, int itemQuantity, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }

    public ItemToPurchase()
    {
        this.itemName = "";
        this.itemPrice = 0.00;
        this.itemQuantity = 0;
        this.itemDescription = "";
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    //Add 2 methods from UML diagram here:
    public void printItemCost(){
        //System.out.print()
        System.out.println(this.itemName + " " + this.itemQuantity + " @ $" + this.itemPrice +
                " = $" + (this.itemQuantity * this.itemPrice));

    }
    public void printItemDescription(){
        System.out.println(this.itemName + ": " + this.itemDescription);

    }
}

/* package domain;

public class ShoppingCart {
    private String itemName = "none";
    private double itemPrice = 0;
    private int itemQuantity = 0;
    private String itemDescription = "none";


    public ShoppingCart(String itemName, double itemPrice, int itemQuantity, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;

    }
}
    public ShoppingCart(){

    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return itemPrice;
    }

    public void setPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public static void printItemCost(){
        //System.out.print()
        System.out.println(cartItem.getName() + " " + cartItem.getQuantity() + " @ $" + cartItem.getPrice() +
                " = $" + (cartItem.getQuantity() * cartItem.getPrice()));
        System.out.println(cartItem.getName() + ": " + cartItem.getDescription());

    }
    public static void printItemCost(){

    }
}
}

 */
