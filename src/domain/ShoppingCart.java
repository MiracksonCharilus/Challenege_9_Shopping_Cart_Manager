package domain;

import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {

        this.customerName = "none" ;
        this.currentDate = "January 1, 2022,";
        this.cartItems = new ArrayList<ItemToPurchase>();
    }
    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        this.cartItems = new ArrayList<ItemToPurchase>();

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void setDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public void addItem(ItemToPurchase anItem) {
        cartItems.add(anItem);
    }

    public void removeItem(String anItem) {
        int foundIndex = -1;
        int i = 0;
        do {
            if (this.cartItems.get(i).getItemName().equalsIgnoreCase(anItem)){
                foundIndex = i;
            }
            i++;
        }while(foundIndex == -1 && i < this.cartItems.size());

        if (foundIndex == -1) {
            System.out.println("Item not found in cart. Nothing removed.");
        }

        else {
            this.cartItems.remove(foundIndex);
            System.out.println("The item " + anItem + " was removed.");
            //this.cartItems.remove(foundIndex);


        }
    }
    public void modifyItem(ItemToPurchase anItem) {
        int foundIndex = -1;
        int i = 0;
        do {
            if (this.cartItems.get(i).getItemName().equalsIgnoreCase(anItem.getItemName())) {
                foundIndex = i;
            }
            i++;
        } while (foundIndex == -1 && i < this.cartItems.size());

        if (foundIndex == -1) {
            System.out.println("Item not found in cart. Nothing removed.");
        } else {
            //this.cartItems.remove(foundIndex);
            this.cartItems.get(foundIndex).setItemQuantity(anItem.getItemQuantity());
        }
    }

    public int getNumItemsInCart() {
        int numTotal = 0;
        for (int i = 0; i < this.cartItems.size(); i++){
            numTotal = numTotal + this.cartItems.get(i).getItemQuantity();
        }
        return numTotal;
    }
    public double getNumCostInCart() {
        double numTotal = 0;
        double tempNum = 0;
        for (int i = 0; i < this.cartItems.size(); i++){
            tempNum = this.cartItems.get(i).getItemQuantity() * this.cartItems.get(i).getItemPrice();
            numTotal = numTotal + tempNum;
        }
        return numTotal;
    }
    public void printTotal() {
        System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
        System.out.println("Number of Items: " + getNumItemsInCart());
        System.out.println("\n");

        for (int i = 0; i < this.cartItems.size(); i++){
            this.cartItems.get(i).printItemCost();
            //System.out.println(printItemCost(cartItems(i)));
        }
        System.out.println("Total: $" + getNumCostInCart());

    }
    public void printDescriptions() {
        System.out.println(this.customerName+ "'s Shopping Cart - " + this.currentDate);
        System.out.println("Item Descriptions: ");
        System.out.println("\n");

        for (int i = 0; i < this.cartItems.size(); i++){

            this.cartItems.get(i).printItemDescription();
        }

    }
}

