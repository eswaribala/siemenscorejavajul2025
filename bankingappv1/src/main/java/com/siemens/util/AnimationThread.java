package com.siemens.util;

public class AnimationThread extends Thread{
    private String name;
    public AnimationThread(String name) {
        super(name);
        this.name=name;

    }

    @Override
    public void run() {
        name.chars().forEach(c->{
            System.out.print((char)c+"\t");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
