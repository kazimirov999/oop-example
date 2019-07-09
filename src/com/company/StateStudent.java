package com.company;

public class StateStudent extends Student{

    protected final String STATE_STUDENT = "I'm a state student: ";
    public String grant;

    public StateStudent(String name, int age, String universityName, int course) {
        super(name, age, universityName, course);
    }

    public StateStudent(String name, int age, String universityName, String facultyName, int course) {
        super(name, age, universityName, facultyName, course);
    }

    public static void studentGreeting(){
        System.out.println("Hi");
    }

    public void setGrant(){grant = "grant";}

    public void showGrant(){
        if(grant.isEmpty()){
            System.out.println("I dont have a grant.");
        }else{
            System.out.println("I'm a state student and i have a " + grant + ".");
        }
    }

    public String toString() {
        return STATE_STUDENT + this.getName();
    }

}
