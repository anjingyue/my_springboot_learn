package com.jvm_test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.Serializable;

public final class Hello implements Serializable, ApplicationContextAware {

    public static int a = 4;

    public final static String str = "aaa";

    public Hello() {
    }


    public static void main(String[] args) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public void test() throws BeansException, Exception {

    }

    public static class A {

    }
}
