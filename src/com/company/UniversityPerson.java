package com.company;

public abstract class UniversityPerson extends Human{

    protected static int numberOfUniversityPerson = 0;
    protected String universityName;
    protected String facultyName;

    public UniversityPerson(String name,int age){
        super(name,age);
    }

    public UniversityPerson(String name, int age,String universityName){
        super(name,age);
        this.universityName = universityName;
    }

    public UniversityPerson(String name, int age,String universityName,String facultyName){
        super(name,age);
        this.universityName = universityName;
        this.facultyName = facultyName;
    }
    public static int getNumberOfUniversityPerson(){
        return numberOfUniversityPerson;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversity(String universityName) {
        this.universityName = universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFaculty(String facultyName) {
        this.facultyName = facultyName;
    }
}
