package com.company;

public abstract class Student extends UniversityPerson{

    protected int course;
    protected static int numberOfStudents = 0;
    protected static final String AMOUNT_OF_STUDENTS = "Количество студентов на данный момент составляет: ";
    protected StudentRecordBook studentRecordBook;

    public Student(String name, int age, String universityName, int course) {
        super(name,age,universityName);
        studentRecordBook = new StudentRecordBook();
        this.course=course;
        numberOfUniversityPerson++;
        numberOfStudents++;
    }

    public Student(String name, int age, String universityName, String facultyName, int course) {
        super(name,age, universityName,facultyName);
        this.course=course;
        studentRecordBook = new StudentRecordBook();
        numberOfUniversityPerson++;
        numberOfStudents++;
    }

    public static void studentGreeting(){
        System.out.println("Hello");
    }

    public static int printNumbOfStudents (){
        return numberOfStudents;
    }

    public String toString() {
        return "I'm a student: " + this.getName();
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }


}
