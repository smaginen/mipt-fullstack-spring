package com.mipt.fullstackspring.my_spring;


import javax.annotation.PostConstruct;


public class IRobot {

    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(speaker.getClass());
    }

    public void clean() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("всё");
    }
}
