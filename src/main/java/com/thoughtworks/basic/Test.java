package com.thoughtworks.basic;

public class Test {

    public static void main(String[] args) {
        Klass klass = new Klass("Class 2");

        Teacher teacher = new Teacher("YangJie", 30, "Math");

        Student student1 = new Student("Tom", 10, klass);
        Student student2 = new Student("Jerry", 11, klass);

        klass.setTeacher(teacher);
        klass.addStudent(student1);
        klass.addStudent(student2);

        student1.changeName("LiLei");

        klass.changeClassNumber("Class 3");


    }

}
