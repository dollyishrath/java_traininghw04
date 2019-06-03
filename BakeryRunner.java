package com.trimindtech.training.home04;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery b1 = new Bakery();
        b1.getOrder();
        Bakery b2 = new Bakery();
        b2.getOrder();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}