package com.thoughtworks.basic;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String introduce();

    public void receive(String message){
        System.out.println(name + " received message : " + message);
    }
}
