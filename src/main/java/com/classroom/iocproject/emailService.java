package com.classroom.iocproject;

import org.springframework.stereotype.Component;

@Component
public class emailService {

    void printemail(){
        System.out.println("Email is displayed");
    }
}
