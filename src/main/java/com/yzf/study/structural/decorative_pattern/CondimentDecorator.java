package com.yzf.study.structural.decorative_pattern;

/**
 * @description: 饮料装饰类
 * @author leo
 * @date 2023/8/13 15:39
 * @version 1.0
 */
public abstract class CondimentDecorator extends Beverage{

    public Beverage beverage;

    @Override
    public String getDescription() {
        return this.description + "," + this.beverage.getDescription();
    }
   
}
