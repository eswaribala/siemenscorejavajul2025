package com.siemens.util;

import com.github.javafaker.Faker;

public class ThreadDemo {
    public static void main(String[] args) {
        AnimationThread animationThread=new AnimationThread(new Faker().name().firstName());
        animationThread.start();

    }
}
