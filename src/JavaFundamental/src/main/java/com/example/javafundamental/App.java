package com.example.javafundamental;

import java.awt.*;
import java.time.Duration;
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
        classes.add(new OnlineClass(1, "spring boot", true));
        classes.add(new OnlineClass(2, "spring data jpa", true));
        classes.add(new OnlineClass(3, "spring mvc", false));
        classes.add(new OnlineClass(4, "spring core", false));
        classes.add(new OnlineClass(5, "rest api development", false));

        OnlineClass spring = new OnlineClass(1,"spring boot", true);
        Duration studyDuration = spring.getProgress().getStudyDuration();
        System.out.println(studyDuration);
    }
}
