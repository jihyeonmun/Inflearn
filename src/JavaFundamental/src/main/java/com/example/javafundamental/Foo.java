package com.example.javafundamental;

import java.util.function.*;

public class Foo {
    public static void main(String[] args){
        Foo foo = new Foo();
        foo.run();
    }
    private void run() {
        final int baseNumber = 10;

        Consumer<Integer> integerConsumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer integer){
                System.out.println(baseNumber);
            }
        };
        IntConsumer printInt = (i) -> System.out.println(i+baseNumber);
        printInt.accept(10);
    }
}
