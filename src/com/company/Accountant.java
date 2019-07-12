package com.company;

public class Accountant {
    private ProfessorAccounting professorAccounting;
    private StudentAccounting studentAccounting;

    Accountant(){
        professorAccounting = new ProfessorAccounting();
        studentAccounting = new StudentAccounting();
    }

    public void setSalary(Student student,int salary){
        studentAccounting.getSalary(student,salary);
    }

    public void setSalary(Professor professor,int salary){
        professorAccounting.getSalary(professor,salary);
    }

}