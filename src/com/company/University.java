package com.company;

public class University {

    private String name;
    private int age;


    public University(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void congratulations(){
        System.out.println("Happy b-day to me,now our university: " + age+" year.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
