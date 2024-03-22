package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args){
        // Scanner 객체를 사용하여 월 값을 정수로 입력받는다.
        //month 값에 따라 계절을 나타낼 수 있도록 switch문

        Scanner scan=new Scanner(System.in);
        System.out.print("현재 몇 월입니까?");
        int month=scan.nextInt();
        System.out.print("현재 계절은 ");

        String result=switch(month){
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 ->"가을";
            default -> "다섯 번째 계절";
        }; System.out.print(result+"입니다.");


    }
}
