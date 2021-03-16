package com.classroom;

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("kay"));
        studentList.add(new Student("Ade"));
        studentList.add(new Student("lai"));
        studentList.add(new Student("ayo"));
        studentList.add(new Student("ope"));

        Teacher auntyBee = new Teacher("Omolara Elizabeth");
        Classroom class1 = new Classroom("SS1", auntyBee, studentList );

        class1.printClassDetails();


        Student jerry = new Student("Jerry");
        class1.addStudent(jerry);


        Student mary = new Student("Mary");
        Student arya = new Student("Arya Stark");

        ArrayList<Student> newStudents = new ArrayList<Student>();
        newStudents.add(arya);
        newStudents.add(mary);

        class1.addStudents(newStudents);
        class1.printClassDetails();

        // class1.removeStudents(newStudents);
        // class1.printClassDetails();

        mary.changeGraduatedStatus(true);
        arya.changeGraduatedStatus(true);

        class1.removeGraduatedStudents();

        class1.printClassDetails();
    }
}
