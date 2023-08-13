package com.yzf.study.structural.decorative_pattern;

public class Test01 {

    public static void main(String[] args) {

        Beverage b = new DarkRoast();
        b = new Milk(b);
        b = new Mocha(b);
        System.out.println(b.cost());
        System.out.println(b.getDescription());


    }


}
