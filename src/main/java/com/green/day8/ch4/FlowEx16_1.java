package com.green.day8.ch4;

public class FlowEx16_1 {
    public static void main(String[] args){
        int star=5;
        //star 값이 5면 별을 5개 가로로, star값이 3이면 별을 3개 가로로 출력+개행
        System.out.println("*".repeat(star));

        for(int i=0;i<star;i++) {
            System.out.print("*");
        }System.out.println();
    }
}
