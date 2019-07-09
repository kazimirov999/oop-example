package com.company;

public class ManagerSalary {
    private CountingProfessor countingProfessor;
    private CountingStudent countingStudent;

    ManagerSalary(){
        countingProfessor = new CountingProfessor();
        countingStudent = new CountingStudent();
    }

    public void getSal(Student student,int sal){
        countingStudent.getSalary(student,sal);
    }

    public void getSal(Professor professor,int sal){
        countingProfessor.getSalary(professor,sal);
    }

}
