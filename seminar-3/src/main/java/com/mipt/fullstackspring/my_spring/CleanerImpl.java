package com.mipt.fullstackspring.my_spring;


@Benchmark
public class CleanerImpl implements Cleaner {

    @InjectRandom(min = 3, max = 5)
    private int repeat;

    private Cleaner proxy;

    @Override
    public void clean() {

        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVvvvvvvvvvvvvv");
        }
    }

    public void doX() {

        System.out.println("XXXXXXXXXXXXXXxx");
    }
}
