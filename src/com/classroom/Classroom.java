package com.classroom;

import java.util.ArrayList;
import java.util.Iterator;

public class Classroom {
    private String className;
    private Teacher classTeacher;
    private ArrayList<Student> studentList;

    public Classroom(String className, Teacher classTeacher, ArrayList<Student> studentList){
        this.className = className;
        this.classTeacher = classTeacher;
        this.studentList = studentList;
    }

    public void addStudents(ArrayList<Student> student){
        studentList.addAll(student);
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public void removeStudents(ArrayList<Student> student){
        studentList.removeAll(student);
    }

    public void removeGraduatedStudents (){
        Iterator<Student> i = studentList.iterator();
        while (i.hasNext()) {
            Student s = i.next();
            if(s.haveGraduated){
                i.remove();
            }

        }
    }

    public void changeTeacher(Teacher classTeacher){
        this.classTeacher = classTeacher;
    }

    public void printClassDetails(){
        System.out.print("\n\n" + className
                + " is taught by  "+ classTeacher.name +"\n and contains "
                + studentList.size() + " students.");
    }
}
