package com.green.day8.ch4;

public class FlowEx19 {
    public static void main(String[] args) {
        //파이널로 주는 게 좋다 고칠때도 파이널만 고치면 됨
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                for (int z = 1; z <= 3; z++) {
                    System.out.printf("%d%d%d ", x, y, z);
                }System.out.println();
            }System.out.println();
        }
    }
}
