package com.mipt.fullstackspring.my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;


public class InjectRandomObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            InjectRandom annotation = field.getAnnotation(InjectRandom.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = min + random.nextInt(max-min);
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
