package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    /*[1주차]자바 기본 문법 3*/
    /*메소드의 구조*//*
    public 반환타입 메소드명(재료){
        명령 모음
        return 결과값; //  필요할 경우 return
   }*/
    /*메소드가 있을때*//*
    // public, static void 에 대해서는 곧 배웁니다! 우선은 넘어갈게요.
    public static void printInfo() {
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
    }*/
    /*메소드의 파라미터, 반환값 다양한 경우*//*
    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {    //  반드시 자료형 작성 필요
        return num1 + num2;
    }*/
    /*메소드 연습퀴즈*//*
    // 두 정수를 받아서, 뺀 값을 반환하는 메소드를 만들고, 그 값을 인쇄
    public static int sub(int a, int b) {
        return a - b;
    }*/


    /*[1]주차 기본 문법 4*/
    /*"감" 개수 세는 반복문*//*
    public static int countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int cnt = 0; // 과일의 개수를 셀 변수
        for (int i = 0; i < fruits.size(); i++) {
            String f = fruits.get(i);
            if (f == fruit) {
                cnt++;
            }
        }
        return cnt;
    }*/


    public static void main(String[] args) {

        /*변수 & 기초 문법*//*
         * 변수는 "값을 담는 상자"
         * 변수를 선언할 떄는 (자료의 종류)(변수명) = (값) 의 순서
         * 변수명은 일반적으로 1)영어, 2)소문자 시작, 3) 구분은 대문자로
         * 자바는 항상 코드를 작성하고 제일 마지막에 세미콜론(;) 사용*/

//      System.out.println("안녕, 스파르타!");

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



        /*[1주차]자바 기본 문법 3*/
        /*메소드*//*
         * 반복적인 행동을 줄여서 어디든 갖다쓸 수 있는 명령 모음
         * 메소드명은 변수명과 규칙(영어사용, 소문자시작, 공백없음, 대문자구분)이 같음
         * 컴퓨터에게 명령하려면 세 가지 요소가 필요
         *  1. 재료 = 파라미터 (없을 수 있음)
         *  2. 명령 = 실행코드
         *  3. 결과 = 반환값 (없을 수 있음)*/
        /*메소드가 없을때*//*
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
*/
        /*메소드가 있을때*//*
        printInfo();
        printInfo();
        printInfo();
        printInfo();
        printInfo();*/
        /*메소드의 파라미터, 반환값 다양한 경우*//*
        // 파라미터 X, 반환값 X
        simplePrint();

        // 파라미터 O, 반환값 X
        simpleSum(1, 2);

        // 파라미터 X, 반환값 O
        int ret = simpleReturn();
        System.out.println(ret);

        // 파라미터 O, 반환값 O
        int ret2 = sum(10, 7);
        System.out.println(ret2);*/
        /*메소드 연습퀴즈*//*
        int minus = sub(1, 2);
        System.out.println(minus);*/



        /*[1주차]자바 기본 문법 4*/
        /*반복문*/
        /*반복문 구조*//*
          for (시작조건; 반복을계속할조건; 더하기){
              명령
          }*/
        /*과일 목록 준비*//*
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");
        System.out.println(fruits);*/
        /*과일 목록 차례로 인쇄 - 반복문 없이*//*
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(5));
        System.out.println(fruits.get(6));
        System.out.println(fruits.get(7));
        System.out.println(fruits.get(8));
        System.out.println(fruits.get(9));
        System.out.println(fruits.get(10));
        System.out.println(fruits.get(11));
        System.out.println(fruits.get(12));*/
        /*과일 목록 차례로 인쇄 - 반복문 사용*//*
        for (int i = 0; i < 13; i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }   // 매번 13개, 14개, 12개.. 개수 세어줘야 할까요?*/
        /*반복문 연습퀴즈*//*
        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        //My code
        for (int i = 0; i < celebs.size(); i++) {
            String celeb = celebs.get(i);
            System.out.println(celeb);
        }

        System.out.println("=========================");

        //해설
        for (int idx = 0; idx < celebs.size(); idx++) {
            System.out.println(celebs.get(idx));
        }*/
        /*=======================*/
        /*조건문*//*
        boolean 타입을 활용하여 특정 경우일 때 명령을 내리는 문법*/
        /*미성년자 여부 판별하기*//*
        int age = 20;
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }*/
        /*if문 기본 구조*//*
        if (조건1) {
            명령문1    // 조건1이 참일 경우 실행할 명령문1
        } else {
            명령문2    //  조건 1이 참이 아닐 경우 실행할 명령문2
        }*/
        /*=======================*/
        /*"감" 개수 세는 반복문*//*
        int gam = countFruit("감");
        int subak = countFruit("수박");
        int straw = countFruit("딸기");
        System.out.println(gam);
        System.out.println(subak);
        System.out.println(straw);*/


        /*[1주차] 자바 클래스*/
        /*Ex1*//*
        Course course = new Course();
        course.title = "웹개발의 봄, Spring";
        course.tutor = "남병관";
        System.out.println(course.title);
        System.out.println(course.tutor);*/
        /*Ex2*//*
        Course course2 = new Course();
        course2.title = "프론트엔드의 꽃, React";
        course2.tutor = "임민영";
        System.out.println(course2.title);
        System.out.println(course2.tutor);*/
        /*Ex3*//*
        String title = "웹개발의 봄, Spring";
        String tutor = "남병관";
        int days = 35;
        Course course = new Course(title, tutor, days);
        System.out.println(course.title);
        System.out.println(course.tutor);
        System.out.println(course.days);*/


        /*[1주차]Getter, Setter*/
        String title = "웹개발의 봄, Spring";
        String tutor = "남병관";
        int days = 35;

        Course course = new Course();
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

    }
}