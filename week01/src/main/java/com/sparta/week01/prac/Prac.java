package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    public static void main(String[] args) {

        /*변수 & 기초 문법*//*
         * 변수는 "값을 담는 상자"
         * 변수를 선언할 떄는 (자료의 종류)(변수명) = (값) 의 순서
         * 변수명은 일반적으로 1)영어, 2)소문자 시작, 3) 구분은 대문자로
         * 자바는 항상 코드를 작성하고 제일 마지막에 세미콜론(;) 사용*/

        System.out.println("안녕, 스파르타!");

        /*[1주차]자바 기본 문법 1*/

        /*숫자형 int, float, Long*//*

        int a = 7;
        int b = 3;
        System.out.println(a + b);

        float c = 3.7f; // 오류 방지를 위해서 f 붙여서 사용
        System.out.println(c);

        Long d = 10000000000L; // 오류 방지를 위해서 L 붙여서 사용
        System.out.println(d);


        */
        /*문자형 String*//*

        String myName = "백종석";  //  문자열은 대문자 S로 시작, 반드시 "" 사용
        String myName2 = "조연화";
        String myName3 = myName + myName2;
        System.out.println(myName3);
*/



        /*[1주차]자바 기본 문법 2*/

        /*참거짓 blooean*//*

        int myAge = 20;
        boolean isAdult = myAge > 20;
        boolean isKid = myAge <= 20;
        System.out.println(isAdult);
        System.out.println(isKid);

        //  같은지는 == 으로 확인, 다른지는 != 으로 확인
        System.out.println(myAge == 20);
        System.out.println(myAge != 20);


        */
        /*배열 List*//*
         * 1. 순서가 중료
         * 2. 같은 자료형만 가능
         * 3. 넣을 때는 add, 조회할 때는 get, 제가할 때는 remove 사용*//*

        List<String> myList = new ArrayList<>();
        String course1 = "웹개발의 봄 Spring";
        String course2 = "프론트엔드의 꽃 React";
        myList.add(course1);
        myList.add(course2);

        System.out.println(myList);
        System.out.println(myList.get(1));  //  배열은 0 부터 시작하기 때문에, 2번째를 꺼내기 위해서는 1을 입력

        myList.remove(1);   //  리스트에서 항목 제거 할 때는 .remove
        */
        /*임포트*//*
         * List 처럼, 미리 작성된 코드를 불러오는 것*/
        /*주석*//*
         * 주석은 "나만 볼 수 있고 컴퓨터는 알아듣지 못하는 메모"
         * 개발자들끼리 소통하거나, 내가 개발하다가 메모를 남기고 싶을 때 주석을 사용*/
        /*연습퀴즈*//*
         * course1 이라는 이름의 변수에 값을 "웹개발 종합반",
         * course2 라는 이름의 변수에 값을 "앱개발 종합반",
         * 넣고, course1과 course2를 courseList라는 배열에 순서대로 넣으려면?*//*

        //선언
        List<String> courseList = new ArrayList<>();
        String course1 = "웹개발 종합반";
        String course2 = "앱개발 종합반";

        //추가
        courseList.add(course1);
        courseList.add(course2);

        //확인
        System.out.println(courseList);
*/

    }
}
