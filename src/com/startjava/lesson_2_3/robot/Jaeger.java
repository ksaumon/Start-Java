package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private int numberPilots;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, float height, float weight,
            int strength, int armor, int numberPilots) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.numberPilots = numberPilots;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getNumberPilots() {
        return numberPilots;
    }

    public void setNumberPilots(int numberPilots) {
        this.numberPilots = numberPilots;
    }

    public void move() {
        System.out.println("moving");
    }

    public boolean drift() {
        return true;
    }

    public void attack() {
        System.out.println("damage");
    }

    public void block() {
        System.out.println("block damage");
    }
}