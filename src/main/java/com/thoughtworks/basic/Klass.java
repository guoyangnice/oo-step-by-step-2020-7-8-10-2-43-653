package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    protected String classNumber;

    private List<Student> students = new ArrayList<>();

    private Teacher teacher;

    public Klass(String classNumber) {
        this.classNumber = classNumber;
    }

    /**
     * 添加学生
     *
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * 设置老师
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void notifyChange(Student student) {
        String message = student.introduce();
        for (Student stu : students) {
            if (stu != student) {
                stu.receive(message);
            }
        }
        if (null != teacher) {
            teacher.receive(message);
        }
    }

    public void notifyChange(String message) {
        for (Student stu : students) {
            stu.receive(message);
        }
        if (null != teacher) {
            teacher.receive(message);
        }
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void changeClassNumber(String classNumber) {
        this.classNumber = classNumber;
        String message = String.format(" Class changed to %s now.", classNumber);
        notifyChange(message);
    }
}
