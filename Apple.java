package com.newfeatures;

public class Apple {
    private String color; // 颜色
    private double weight; // 重量

    public Apple() {
        this.color = null;
        this.weight = 0.0;
    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "颜色 :" + this.color + ", 重量 :" + this.weight;
    }
}