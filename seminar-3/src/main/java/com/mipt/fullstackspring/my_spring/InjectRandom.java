package com.mipt.fullstackspring.my_spring;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface InjectRandom {
    int min() default 1;

    int max();
}
