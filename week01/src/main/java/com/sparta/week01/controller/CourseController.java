package com.sparta.week01.controller;

import com.sparta.week01.prac.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController/*서버의 응답을 JSON형식으로 응답하기 위한 어노테이션*/
public class CourseController {

    @GetMapping("/courses")/*("/courses")형식으로 요청을 받을 경우 응답을 해줄 메소드*/
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(35);
        course.setTutor("남병관");
        return course;
    }
}