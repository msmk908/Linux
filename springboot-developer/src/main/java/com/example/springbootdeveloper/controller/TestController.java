package com.example.springbootdeveloper.controller;

import com.example.springbootdeveloper.dto.Member;
import com.example.springbootdeveloper.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired // TestService 빈 주입
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMember() {
        List<Member> members = testService.getAllMembers();
        return members;
    }

}

