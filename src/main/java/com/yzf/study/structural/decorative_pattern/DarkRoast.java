package com.yzf.study.structural.decorative_pattern;

/**
 * @description: 被装饰对象
 * @author leo
 * @date 2023/8/13 15:34
 * @version 1.0
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public Double cost() {
        return 16.00;
    }
}
