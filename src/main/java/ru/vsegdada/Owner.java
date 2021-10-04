package ru.vsegdada;

public class Owner {
    private String firstname = "Dmitriy";
    private String lastname = "Neganov";
    private int age = 30;
    private String allInfoOwner = firstname + " " + lastname + ", " + age + " years";

    public void printOwnerName() {
        System.out.println("Hello, My name is " + firstname + " " + lastname + ", " + age + " years");
    }

    public void printInfoOwner() {
        System.out.println(allInfoOwner);
    }
}
