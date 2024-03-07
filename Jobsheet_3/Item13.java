package Jobsheet_3;

public class Item13 {

    public String name;
    public double price;
    public int stock;

    public Item13() {
        
    }

    public Item13(String itemName, double itemPrice, int itemStock){
        name = itemName;
        price = itemPrice;
        stock = itemStock;

    }

    public void displayInfo(){
        System.out.print("Name : " + name);
        System.out.print("Price : " + price);
        System.out.print("Stock : " + stock);

    }
}
