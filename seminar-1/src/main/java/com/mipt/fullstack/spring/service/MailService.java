package com.mipt.fullstack.spring.service;

import org.springframework.stereotype.Service;

@Service
public class MailService {
    public void sendEmail(){
        System.out.println("Send mail");
    }
}
