package com.sparta.week01.prac;

public class HW_Person {
    private String name;
    private int age;
    private String address;
    private String petName;

    /*Setter*/
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    /*Getter*/
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPetName() {
        return this.petName;
    }
}
