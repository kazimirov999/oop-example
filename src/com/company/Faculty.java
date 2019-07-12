package com.company;

public class Faculty{

    private String universityName;
    private String name;
    private int age;

    Faculty(String name,int age,String universityName){
        this.age = age;
        this.name = name;
        this.universityName = universityName;
    }

    public boolean checkName(){
        if(age>20){
            String prefix = "pre ";
            name = prefix + name;
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "university=" + universityName +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
