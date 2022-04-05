package com.sparta.week01.controller;

import com.sparta.week01.prac.HW_Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HW_PersonController {

    @GetMapping("/myinfo")
    public HW_Person getPerson() {
        HW_Person person = new HW_Person();

        person.setName("우당탕탕뚝딱이");
        person.setAge(30);
        person.setAddress("서울특별시 영등포");
        person.setPetName("하늘이");

        return person;
    }
}