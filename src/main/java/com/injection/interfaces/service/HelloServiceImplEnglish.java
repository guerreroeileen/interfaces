package com.injection.interfaces.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloServiceImplEnglish implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("Hello!!!!");
    }
}
