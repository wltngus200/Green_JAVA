package com.green.TestScore;

import java.util.Scanner;

public class BBG_2_ReStart {
    public static void main(String[] args) {
        /*
        새로운 필드 개척 **세 자리에 중복되는 숫자는 없다!
        0. 수식이 맞는지 확인할 임시 수치 입력
        1. while문을 먼저 만들어 배열이 일치하면 깨지는 반복문 만들기
                                ...

        */

        Scanner scan = new Scanner(System.in);
        char[] answer = {'1', '2', '3'};//공식이 맞는지 확인을 위한 임시치 부여

        int strike = 0; //자리수와 문자 모두 일치
        int ball = 0; //문자만 일치
        int out = 0; //문자가 들어가지 않음

        char[] user = {'9', '2', '3'}; //0 스트라이크 2 볼 1 아웃
        for (int i = 0; i < user.length; i++) { //user의 값
            for (int j = 0; j < answer.length; j++) { //answer의 값
                if (i == j && user[i]==answer[j]) {
                    //0-012 1-012 2-012로 순환
                    strike += 1;
                    break;
                } else if (i!=j && user[i]==answer[j]) {
                    ball += 1;
                    break;
                } else {
                    out += 1;
                    break;
                }//끝자리로 가면 옳지 않은 결과
            }
        }
        System.out.printf("%d strike %d ball %d out", strike, ball, out);
    }
}


/*
        while(true){
            System.out.print("숫자를 입력하세요.");
            String input=scan.nextLine();
            char[] result=input.toCharArray();//문자열을 문자의 배열로 교체
            if(answer[0]==result[0] && answer[1]==result[1] && answer[2]==result[2]) {
                break;
            } else {

            }System.out.println("정답입니다.");
        }*/
