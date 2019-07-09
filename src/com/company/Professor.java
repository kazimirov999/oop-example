package com.company;


public class Professor extends UniversityPerson {

    private final String PROFESSOR_WORK = "Professor teach a students.";

    public Professor(String name, int age){
        super(name,age);
        numberOfUniversityPerson++;
    }

    public Professor(String name, int age, String universityName, String facultyName){
        super(name,age, universityName,facultyName);
        numberOfUniversityPerson++;
    }

    public void teach() {
        System.out.println(PROFESSOR_WORK);
    }

    @Override
    public String toString()  {
        return "I'm a professor: " + this.getName();
    }



}
