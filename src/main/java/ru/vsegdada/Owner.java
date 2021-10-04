package ru.vsegdada;

public class Owner{
    private String firstname = "Dmitriy";
    private String lastname = "Neganov";
    private int age = 30;
    private String allinfoowner = firstname + " " + lastname + ", "+ age + " years";

    public void sayMyName(){
       System.out.println("Hello, My name is " + firstname + " " + lastname + ", "+ age + " years");
   }
   public void infoOwner(){
        System.out.println(allinfoowner);
    }
    }
