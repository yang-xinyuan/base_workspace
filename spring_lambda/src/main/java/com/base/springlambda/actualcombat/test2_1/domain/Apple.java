package com.base.springlambda.actualcombat.test2_1.domain;

public class Apple {
    private AppleEnum color;
    private Float weight;

    public void print(){
        System.out.println(this.color+"的重量是："+this.weight);
    }


    public AppleEnum getColor() {
        return color;
    }

    public void setColor(AppleEnum color) {
        this.color = color;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
