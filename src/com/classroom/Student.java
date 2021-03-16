package com.classroom;

public class Student extends Person {
    public String currentClass;
    public Boolean haveGraduated = false;

    public Student(String name){
        this.name = name;
        this.currentClass = currentClass;
    }
    public void changeGraduatedStatus (Boolean status){
        this.haveGraduated = status;
    }
    public String toString(){
        return "Student name " + name + ", class taught " + currentClass + ".";
    }
}
