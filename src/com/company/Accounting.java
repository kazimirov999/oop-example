package com.company;

public interface Accounting<T extends UniversityPerson,S extends Currency>{
    String getSalary(T person,int salary);

    S getCurrency();
}