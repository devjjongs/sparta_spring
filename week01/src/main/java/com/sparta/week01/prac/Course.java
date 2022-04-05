package com.sparta.week01.prac;


public class Course {


    /*[1주차] 자바 클래스*/
    /*객체지향 프로그래밍*//*
     * 조금 더 프로그래밍을 현실 세계에 빗대어 체계적으로 해보자는 발상이, 객체 지향 프로그래밍의 핵심*/
    /*클래스*//*
     * 현실과 비슷한 개념(객체)을 나타내기 위한 자바의 도구*/

    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!
    /*public String title;
    public String tutor;
    public int days;*/


    /*기본 생성자*//*
    public Course() {

    }*/
    /*생성자*//*
    public Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }*/


    /*Setter*//*
    기본 문법
    public 리턴타입 메소드명(재료){
        명령
    }*/

    private String title;
    private String tutor;
    private int days;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setDays(int days) {
        this.days = days;
    }

    /*Getter*//*
    기본문법
    public 반환타입 메소드명(재료) {
        명령
        return 반환값;(필요하다면)
    }*/
    public String getTitle() {
        return this.title;
    }

    public String getTutor() {
        return this.tutor;
    }

    public int getDays() {
        return this.days;
    }


}
