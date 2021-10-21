package ru.vsegdada;

public class Owner {
    private String firstname = "Ivan";
    private String lastname = "Ivanov";
    private int age = 30;

    @Override
    public String toString() {
        return firstname + " "+
                 lastname + " " + age + " old";
    }
}

