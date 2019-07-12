package com.company;


public class CountingStudent implements Accounting<Student,Value> {
    private String salary;
    private int sal = 800;


    public CountingStudent(){
    }

    @Override
    public String getSalary(Student student,int sal) {
        Value value = getValue();
        salary =  " your salary is: " + sal + " " + value;
        System.out.println("Student " +student.getName() + salary);
        return salary;
    }

    @Override
    public Value getValue() {
        return Value.UAH;
    }
}
