package com.example.javafundamental;

public class DefaultFoo implements Foos {
    String name;
    public DefaultFoo(String name){
        this.name = name;
    }
    @Override
    public void printName(){
        System.out.println(this.name);
    }
    @Override
    public String getName(){
        return this.name;
    }
}
