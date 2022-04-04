package com.sparta.week01.prac;

public class Prac {

    public static void main(String[] args) {

        /*변수 & 기초 문법
         * 변수는 "값을 담는 상자"
         * 변수를 선언할 떄는 (자료의 종류)(변수명) = (값) 의 순서
         * 변수명은 일반적으로 1)영어, 2)소문자 시작, 3) 구분은 대문자로
         * 자바는 항상 코드를 작성하고 제일 마지막에 세미콜론(;) 사용*/


        System.out.println("안녕, 스파르타!");


        /*숫자형 int, float, Long*/
        int a = 7;
        int b = 3;
        System.out.println(a + b);

        float c = 3.7f; // 오류 방지를 위해서 f 붙여서 사용
        System.out.println(c);

        Long d = 10000000000L; // 오류 방지를 위해서 L 붙여서 사용
        System.out.println(d);


        /*문자형 String*/
        String myName = "백종석";  //  문자열은 대문자 S로 시작, 반드시 "" 사용
        String myName2 = "조연화";
        String myName3 = myName + myName2;
        System.out.println(myName3);
    }
}
