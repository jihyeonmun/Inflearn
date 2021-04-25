package com.example.javafundamental;

public interface Foos {
    void printName();
    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    };

    static void printAnything() {
        System.out.println("foo");
    }
    String getName();
}
