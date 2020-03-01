package com.kumar.test.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/testAPI")
    public Person getResponse() {
       return new Person("1001", "Kumar", "33" , "Sydney", "Australia");
    }

}


