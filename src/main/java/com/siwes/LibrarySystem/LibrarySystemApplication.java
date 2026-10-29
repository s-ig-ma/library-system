package com.siwes.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrarySystemApplication {

    public static void main(String[] args) {
        //var ctx = SpringApplication.run(LibrarySystemApplication.class, args);
        SpringApplication.run(LibrarySystemApplication.class, args);
//        MyFirstClass myFirstClass = ctx.getBean("mySecondClass", MyFirstClass.class);
//        System.out.println(myFirstClass.sayHello());
//        MyServiceClass myServiceClass = ctx.getBean(MyServiceClass.class);
//        System.out.println(myServiceClass.dependency());
    }

}

