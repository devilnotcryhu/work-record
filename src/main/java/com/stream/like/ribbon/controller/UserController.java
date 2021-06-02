package com.stream.like.ribbon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "stream/like/work/ribbon/")
public class UserController {

    @RequestMapping(path = "test-string")
    public String sayStr(@RequestParam("string") String string){
        log.info("UserController sayStr string:{}",string);
        return "I'm like work:"+string;
    }
}
