package com.yzf.study.structural.decorative_pattern;

/**
 * @description: 装饰对象
 * @author leo
 * @date 2023/8/13 15:43
 * @version 1.0
 */
public class Mocha extends CondimentDecorator{


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Mocha";
    }

    @Override
    public Double cost() {
        return 0.2 + this.beverage.cost();
    }
}
