package com.mipt.fullstackspring.my_spring;


//@Benchmark
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
