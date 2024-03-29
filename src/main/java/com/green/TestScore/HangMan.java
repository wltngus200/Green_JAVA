package com.green.TestScore;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //정답을 입력받아 문자의 배열로 전환 -> 후에 데이터베이스 같은데서 퍼올 수 있나
        System.out.print("문제를 입력하세요.");
        String input=scan.nextLine();
        char[] answer=input.toCharArray();//문제를 문자열로 전환
        System.out.println(Arrays.toString(answer));
        //글자수를 언더바로 표시
        //만약 스페이스가 있다면 스페이스로 표시하게 가능?? 예외처리
        char[] answer_copy=answer;
        for(int i=0;i<answer_copy.length;i++){
            answer_copy[i]='_';
        }System.out.println(Arrays.toString(answer_copy));
        //사용자에게 묻고 싶은 알파벳 요청(1자리 아니면 반복은 구현함, char의 유니코드를 활용해 영어 소문자로 제한 할 수 있지 않을까)
        char input_user;
        while(true){
            System.out.print("알파벳을 입력하세요.");
            String choice=scan.next();
            if(choice.length()==1){
                input_user=choice.charAt(0);
                break;
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

