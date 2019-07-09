package com.company;


public class CountingProfessor implements Accounting<Professor,Value> {

    private String salary;
    private int sal = 500;

    public CountingProfessor(){
    }

    @Override
    public String getSalary(Professor professor,int sal) {
        Value value = getValue();
        salary =  " your salary is: " + sal + " " + value;
        System.out.println("Professor " +professor.getName() + salary);
        return salary;
    }

    @Override
    public Value getValue() {
        return Value.USD;
    }
}
