package com.trimindtech.training.home04;

import java.util.Scanner;

public class Bakery {
    private String flavors;
    private int weight;
    private int quantity;
    private double totalPrice;
    private double unitPrice;
 static {
     System.out.println("Welcome to micky cake house");
     System.out.println("flavors");
     System.out.println("1.Chocolate moist.\n2.Strawberry.\n3.Blueberry.\n4.Cheesy cake.\n5.American chocolate");
     System.out.println("price per 1kg = rs.25");

 }

    public Bakery(String flavors, int weight, int quantity) {
        this.flavors = flavors;
        this.weight = weight;
        this.quantity = quantity;

    }
    public Bakery(){
     this("",0,0);
     this.flavors = "Chocolate moist";
     this.weight = 1;
     this.quantity = 1;
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "flavors='" + flavors + '\'' +
                ", weight=" + weight +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", unitPrice=" + unitPrice +
                '}';
    }
    public void getOrder(){
        System.out.println("enter the choice of cake flavor(1-5)");
        int ch=0;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch(ch){
            case 1:
                this.flavors = "Chocolate moist";
                break;
            case 2:
                this.flavors = "Strawberry";
                break;
            case 3:
                this.flavors = "Blueberry";
                break;
            case 4:
                this.flavors = "Cheesy cake";
                break;
            case 5:
                this.flavors = "American cake";
                break;
            default:
                System.out.println("enter the valid choice");
        }
        System.out.println("enter the weight of cake in kg");
        this.weight = sc.nextInt();
        System.out.println("enter the quantity that you wanted to order");
        this.quantity = sc.nextInt();
        this.unitPrice = this.weight*25;
        this.totalPrice = this.quantity*this.unitPrice;

    }
}


