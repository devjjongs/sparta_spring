package com.sparta.week01.prac;

public class Tutor {

    /*Getter, Setter mini Quiz*/
    private String name;
    private String bio;

    //기본생성자
    public Tutor() {

    }

    //name,bio 받는 생성자
    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }

}
