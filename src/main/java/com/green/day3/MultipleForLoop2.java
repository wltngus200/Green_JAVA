package com.green.day3;

public class MultipleForLoop2 {
    public static void main(String[] args){
        for(int z=0;z<5;z++) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%d-%d\n", z, i);
            }//i가 끝까지 올라가야 z가 올라감z-i(like a 시계)
            System.out.println("*******");
        }
    }
}
