package com.siwes.LibrarySystem.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServiceClass {

    private MyFirstClass myFirstClass;

    //Constructor Injection
    public MyServiceClass(@Qualifier("bean2") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String dependency(){
        return "Dependency saying => "+myFirstClass.sayHello();
    }
}
