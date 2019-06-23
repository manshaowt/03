package com.newfeatures;

import java.util.Objects;

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);

    // andThen��ִ�е�������ִ�в�����compose���෴
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);  // �ն����쳣�����򷵻�����
        return (T t) -> {
            accept(t);
            after.accept(t);
        };
    }
}


public class LambdaTest {
    public static void ConsumerApple(Apple[] apps, Consumer<Apple> c) {
        for (Apple app : apps) {
            c.accept(app);
        }
    }

    public static void main(String[] args) {
        Apple app1 = new Apple("red", 3.0);
        Apple app2 = new Apple("blue", 4.0);
        Apple app3 = new Apple("green", 5.0);
        Apple[] apps = {app1, app2, app3};


        // lambda��ʽ
        System.out.println("lambdaʵ�ֺ���ʽ�ӿ�");
        ConsumerApple(apps, (c) -> {
            System.out.println(c.toString());
        });


        // �����ڲ���
        System.out.println("�����ڲ���ʵ�ֺ���ʽ�ӿ�");
        ConsumerApple(apps, new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple.toString());
            }
        });


    }
}