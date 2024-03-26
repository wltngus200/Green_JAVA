package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args){
        //1에서 100까지 랜덤값을 생성하고 그걸 맞추는 게임
        //1~100사이 정수를 입력받아 up down

        Scanner scan=new Scanner(System.in);

        System.out.println("1에서 100까지 숫자가 랜덤 출력됩니다.");
        int num=(int)(Math.random()*100.0)+1;//100.0으로 더블
        System.out.println("숫자 맞추기 게임을 시작합니다.");
        System.out.print("1에서 100까지");
        while(true) {
            System.out.print("숫자를 입력해주세요.");
            int input = scan.nextInt();
            if(input<0||input>101) {
                System.out.println("잘못된 값을 입력하셨습니다.");
            } else if (input == num) {
                System.out.println("정답입니다.");
                break;
            } else if (input < num) {
                System.out.println("UP!");
            } else {
                System.out.println("DOWN!");
            }
        }
    }
}
