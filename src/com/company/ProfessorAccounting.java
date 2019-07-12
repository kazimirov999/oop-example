package com.company;


public class ProfessorAccounting implements Accounting<Professor, Currency> {

    private int premium = 0;

    @Override
    public String getSalary(Professor professor,int salary) {
        String wages =  " your salary is: " + (salary + premium) + " " + getCurrency();
        System.out.println("Professor " +professor.getName() + wages);
        return wages;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }
}