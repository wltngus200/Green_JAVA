package com.green.day3;

import java.util.Scanner;

public class MissonIf2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("당신의 키를 입력해주세요");
        int height=scan.nextInt();
        System.out.println("당신의 키는"+height+"cm입니다.");//모두 문자열로 바뀜 (객체까지도)
        //161기준 평균보다 크다 작다
        int avg=161;
        if(height>avg) {
            System.out.println("당신은 평균보다 큽니다.");
        } else if(height==avg) {
            System.out.println("당신은 평균입니다.");
        } else {//두 조건을 제외하면 나머지(=조건 불필요) 추가조건은 else if 사용
            System.out.println("당신은 평균보다 작습니다.");
        }
    }
}
