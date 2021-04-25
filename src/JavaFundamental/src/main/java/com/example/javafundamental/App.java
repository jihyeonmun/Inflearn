package com.example.javafundamental;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> classes = new ArrayList<>();
        classes.add(new OnlineClass(1,"spring boot",true));
        classes.add(new OnlineClass(2,"spring data jpa",true));
        classes.add(new OnlineClass(3,"spring mvc",false));
        classes.add(new OnlineClass(4,"spring core",false));
        classes.add(new OnlineClass(5,"rest api development",false));

        List<OnlineClass> javaclass = new ArrayList<>();
        javaclass.add(new OnlineClass(6,"the java",true));
        javaclass.add(new OnlineClass(7,"the java core",true));
        javaclass.add(new OnlineClass(8,"the java 8 to 11",false));

        List<List<OnlineClass>> jihyeonEvents = new ArrayList<>();
        jihyeonEvents.add(classes);
        jihyeonEvents.add(javaclass);

//        System.out.println("스프링으로 시작하는 수업");
//        classes.stream()
//                .filter(oc->oc.getTitle().startsWith("spring")) //spring으로 시작하는 것만 거른다!
//                .forEach(oc -> System.out.println(oc.getTitle()));

        System.out.println("close 되지 않은 수업");
        classes.stream().filter(oc->!oc.isClosed())
        .forEach(oc-> System.out.println(oc.getId()));

        classes.stream()
                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach(oc-> System.out.println(oc.getId()));
        //7분부터 다시보기 그전에 밑에거 다 해놓기!
//        System.out.println("수업 이름만 모아서 스트림 만들기");
//        //TODO
//        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
//        //TODO
//        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 10개 빼고 최대 10까지만");
//        //TODO
//        System.out.println("스프링으로 시작하는 수업");
//        //TODO
//        System.out.println("스프링으로 시작하는 수업");
//        //TODO
    }
}
