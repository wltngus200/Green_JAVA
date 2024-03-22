package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args){
        //중첩 if문 사용
        //Scanner를 통해 정수로 점수를 입력 받기
        //~90 A ~80 B + 0~2 - 3~6 0 7~9 +
        //C는 그냥
        Scanner scan=new Scanner(System.in);
        System.out.print("점수를 입력해주세요.");
        int score=scan.nextInt();
        if(score>100||score<0){
            System.out.print("올바르지 않은 점수입니다.");
        } else {
            System.out.print("입력된 값을 토대로 나온 귀하의 성적은 ");
            int ten = score / 10;
            int one = score % 10;
            if (ten >= 9) {
                if (0 <= one && one <= 2) {
                    System.out.print("A-");
                } else if (one <= 6) {
                    System.out.print("A0");
                } else {
                    System.out.print("A+");
                }
            } else if (ten == 8) {
                if (0 <= one && one <= 2) {
                    System.out.print("B-");
                } else if (one <= 6) {
                    System.out.print("B0");
                } else {
                    System.out.print("B+");
                }
            } else {
                System.out.print("C");
            }
            System.out.print("입니다.");
        }//97 93으로 나누는 방법도 있다

            /*
        int first=score/10;
        int last=score%10;
        String grade="A";
        String plus="+";

        switch(last){
            case 0,1,2:
                plus="-";
                break;
            case 3,4,5,6:
                plus="0";
                break;
            default:
                break;
        }
        switch(first) {
            case 10:
            case 9:
                break;
            case 8:
                grade = "B";
                break;
            default:
                grade = "C";
                plus="";
                break;
        }System.out.print(grade+plus);*/

    }
}
