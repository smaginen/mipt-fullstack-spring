package com.smagin.mipt.fullstack.patterns.singleton.pattern;


public class SingletonClass {
	private static volatile SingletonClass instance = null;
    private SingletonClass() {
    }
    public static SingletonClass getInstance() {
        if (instance == null) {
        	synchronized(SingletonClass.class){  
        		if (instance == null) {
        			instance = new SingletonClass();
        		}
        	}
        }
        return instance;
    }
}
