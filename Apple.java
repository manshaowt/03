package com.newfeatures;

public class Apple {
    private String color; // ��ɫ
    private double weight; // ����

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
        return "��ɫ :" + this.color + ", ���� :" + this.weight;
    }
}