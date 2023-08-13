package com.yzf.study.structural.decorative_pattern;

/**
 * @description: 被装饰对象
 * @author leo
 * @date 2023/8/13 15:34
 * @version 1.0
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public Double cost() {
        return 12.00;
    }
}
