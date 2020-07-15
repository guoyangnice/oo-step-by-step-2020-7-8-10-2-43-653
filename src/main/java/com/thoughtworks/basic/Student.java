package com.thoughtworks.basic;

public class Student extends Person {

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    private Klass klass;

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a Student of Class %s.", name, age, klass.getClassNumber());
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public void changeName(String newName) {
        this.name = newName;
        klass.notifyChange(this);
    }

}
