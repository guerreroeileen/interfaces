package com.injection.interfaces.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloServiceImplSpanish implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("Holaaaaaaaaa!!!");
    }
}
