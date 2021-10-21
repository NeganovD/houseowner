package ru.vsegdada;

public class House {
    private String address = "Izhevsk";
    private String color = "White";
    private int floor = 2;
    Owner Owner = new Owner();


    public void printInfoHouse() {
        System.out.println("Address: " + address + ", How much floors: " + floor + ", House's color: " + color + ", My Owner: " + Owner);
    }
}
