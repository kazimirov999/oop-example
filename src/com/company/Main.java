package com.company;

public class Main {
    public static void main(String[] args) {
    University university = new University("VNTU",59);
    University university2 = new University("VDPU", 93);

    Faculty languages = new Faculty("Languages",45,university.getName());
    Faculty physical = new Faculty("Physical Culture",80,university2.getName());

    Professor professor = new Professor("Carl",35,university.getName(),languages.getName());
    Professor professor2 = new Professor("Alex",40,university2.getName(),physical.getName());
    Professor professor3 = new Professor("Jay",32);

    Student student = new ExtramuralStudent("Archie",19,university.getName(),2);
    System.out.println(student.toString());
    System.out.println(Student.AMOUNT_OF_STUDENTS + Student.printNumbOfStudents());

    Student student2 = new StateStudent("Michel",20,university2.getName(),3);
    System.out.println(student2.toString());
    System.out.println(Student.AMOUNT_OF_STUDENTS + Student.printNumbOfStudents());

    Accountant accountant = new Accountant();
    accountant.setSalary(professor,500);
    accountant.setSalary(professor2,400);
    accountant.setSalary(professor3,300);

    }
}
