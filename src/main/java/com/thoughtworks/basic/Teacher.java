package com.thoughtworks.basic;

public class Teacher extends Person{
    private String job;

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. I am %s years old. I am a %s Teacher.", name, age, job);
    }
}
