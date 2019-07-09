package com.company;

public class ExtramuralStudent extends Student {

    private final String EXTRAMURAL_STUDENT = "I'm an extramural student: ";
    private String job;


    public ExtramuralStudent(String name, int age, String universityName, int course) {
        super(name, age, universityName,course);
    }

    public ExtramuralStudent(String name, int age, String universityName, String facultyName, int course) {
        super(name, age, universityName, facultyName, course);
    }

    public static void studentGreeting(){
        System.out.println("Hey");
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isWorking(){
        return job.isEmpty();
    }

    @Override
    public String toString() {
        return EXTRAMURAL_STUDENT + this.getName();
    }
}
