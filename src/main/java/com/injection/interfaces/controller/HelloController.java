package com.injection.interfaces.controller;

import com.injection.interfaces.service.HelloService;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Setter
    private HelloService helloService;


    @GetMapping
    public void sayHello(){
        this.helloService.sayHello();
    }


}
