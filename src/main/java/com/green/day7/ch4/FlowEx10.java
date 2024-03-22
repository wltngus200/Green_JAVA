package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args){
        //switch 사용
        //~90 A ~80 B ~70 C 나머지 F
        Scanner scan=new Scanner(System.in);
        System.out.print("점수를 입력하세요");
        int score=scan.nextInt();
        if (score > 100 || score < 0) {
           System.out.print("잘못된 값을 넣으셨습니다.");
        } else {
            String result = switch (score / 10) {
                case 9, 10 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                default -> "F";
            };
            System.out.print(result);
        }
    }
}
