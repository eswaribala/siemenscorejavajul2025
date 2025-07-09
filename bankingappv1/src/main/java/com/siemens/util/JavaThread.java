package com.siemens.util;

public class JavaThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());
    }
}
