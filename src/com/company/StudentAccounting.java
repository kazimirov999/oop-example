package com.company;


public class StudentAccounting implements Accounting<Student, Currency> {

    private int premium;

    @Override
    public String getSalary(Student student,int salary) {
        String wages = " your salary is: " + (salary + premium) + " " + getCurrency();
        System.out.println("Student " + student.getName() + wages);
        return wages;
    }
    @Override
    public Currency getCurrency() {
        return Currency.UAH;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }
}