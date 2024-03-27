package com.green.TestScore;

import java.util.Scanner;

public class BBG_2_ReStart {
    public static void main(String[] args) {
        /*
        새로운 필드 개척
        1. while문을 먼저 만들어 배열이 일치하면 깨지는 반복문 만들기
         */
        Scanner scan = new Scanner(System.in);
        char[] answer = {'1', '2', '3'};//공식이 맞는지 확인을 위한 임시치 부여

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

        int strike = 0;
        int ball = 0;
        int out = 0;

        char[] answer2 = {'3', '3', '3'}; //1스트라이크 1볼 1아웃
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer2.length; j++) {
                if (i == j && answer[i] == answer2[j]) {
                    strike += 1;
                    break;
                } else if (i != j && answer[i] == answer2[j]) {
                    ball += 1;
                    break;
                } else if (i != j && answer[i] != answer2[j]) {
                    out += 1;
                    break;
                }//예외처리가 필요해 이미 스트라이크로 나간 애도 한번 더 돌려서 이런 일이..
            }
        }
        System.out.printf("%d strike %d ball %d out", strike, ball, out);
    }
}
