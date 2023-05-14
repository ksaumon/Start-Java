package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setGender("male");
        wolf1.setNickName("Ric");
        wolf1.setWeight(10);
        wolf1.setAge(8);
        wolf1.setColor("green");
        System.out.println("Пол " + wolf1.getGender());
        System.out.println("Кличка " + wolf1.getNickName());
        System.out.println("Вес " + wolf1.getWeight());
        System.out.println("Окрас " + wolf1.getColor());
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}