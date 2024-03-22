package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        //Scanner를 통해 점수를 정수로 받기
        //grade를 관리할 문자타입 선언
        //점수가 ~90 A ~80 B ~70 C 그 외 D

        Scanner scan = new Scanner(System.in);//stream(시냇물) = 데이터가 흐르는 통로
        // 유지비가 많이 듦(스캐너 닫아줘야함=아래)
        System.out.print("점수를 입력하세요");
        int score = scan.nextInt();
        char grade = 'A';
        //이상한 성적이 입력 되었을 때 통과가 되기 때문에 여기서 선언은 낭비 else로
        if(score>100||score<0){
            System.out.println("잘못 된 수치입니다");
        } else {
            if(score>=90){
            } else if(score>=80){
                grade='B';
            } else if(score>=70){
                grade='C';
            } else {
                grade='D';
            }System.out.printf("귀하의 성적은 %d점으로, 학점은 %c입니다.\n" +
                                                    "%7s-수고하셨습니다-",score, grade,"");
        }scan.close();//스캐너 닫기
    }
}
