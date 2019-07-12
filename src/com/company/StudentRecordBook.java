package com.company;

public class StudentRecordBook {
    public static final int HIGHT_RECORDBOOK = 14;
    public static final int WIDTH_RECORDBOOK = 10;
    private String ownerName;


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isOwner() {
        return ownerName.isEmpty();
    }
}