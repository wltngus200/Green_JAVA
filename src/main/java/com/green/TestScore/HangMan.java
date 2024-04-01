package com.green.TestScore;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("문제를 입력하세요.");
        String input_answer=scan.nextLine();//사용자가 입력한 값을 정답으로

        char[] answer=input_answer.toCharArray();//문제를 문자열로 전환
        System.out.println(Arrays.toString(answer));//정답확인용
        //만약 스페이스가 있다면 스페이스로 표시하게 가능?? 예외처리

        char[] answer_copy=new char[answer.length];
        for(int i=0;i<answer.length;i++) {//배열을 복사하여 글자 개수만큼 언더바로 표시
            answer_copy[i]='_';
        }
        /*
        char[] answer_copy=answer; //미스! 주소값 복사를 해버려 카피를 바꾸면 다같이 바뀌어버림
         */

        /*
        사용자에게 묻고 싶은 알파벳 요청(1자리 아니면 반복은 구현함, char의 유니코드를 활용해 영어 소문자로 제한 할 수 있지 않을까)
        a=97 z=122
         */
        char input_user;
        System.out.print("알파벳을 입력하세요.");
        while(true){
            String choice=scan.next();
            if(choice.length()==1){
                input_user=choice.charAt(0);
                if(input_user>=97&&input_user<=122){
                    break;//사용자가 알파벳 1글자를 입력하는지 확인
                }else{
                    System.out.println("입력이 올바르지 않습니다.");
                    System.out.println("영어 소문자를 입력하세요.");
                }
            }
        }
        //반복을 통해 입력한 문자가 배열에 있는지 확인
        //문자 배열 또 오류나네 ㅎㅎ
        for(int i=0;i<answer.length;i++){
            if(input_user==answer[i]){
                System.out.println("있습니다.");
            } else {
                System.out.println("없습니다.");
            }
        }

    }
}

