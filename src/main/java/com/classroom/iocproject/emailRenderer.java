package com.classroom.iocproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class emailRenderer {

    @Autowired
    emailService emailsvc;

    void doemailrendering(){
        System.out.println("Email is rendering");
        System.out.println("-----");
        emailsvc.printemail();

    }
}
