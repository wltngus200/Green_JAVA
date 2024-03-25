package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args){
        //주민등록번호 뒷자리 첫번째가 자리수로 남녀 구분
        //1과 3, 2와 4로 출생년도(2000년 전후) 구분
        //이외의 값 유효하지 않은 주민번호입니다 출력
        //ONLY switch만

        Scanner scan=new Scanner(System.in);

        System.out.print("주민번호를 입력해주세요(******-*******)");
        String id=scan.nextLine();

        char a=id.charAt(7);

        /*
        남/녀, 전/후 문자열로 정의
        switch(){
            default:
                유효하지 않은... 출력
            case 1 3:
                switch{
                    case 3: 후
                }System.out.printf("당신은 2000년 이%s...)

         */

        String gender=switch(a){
            case '1' -> "당신은 2000년 이전에 출생한 남자입니다.";
            case '2' -> "당신은 2000년 이전에 출생한 여자입니다.";
            case '3' -> "당신은 2000년 이후에 출생한 남자입니다.";
            case '4' -> "당신은 2000년 이후에 출생한 여자입니다.";
            default -> "잘못된 값을 입력하였습니다.";
        };System.out.print(gender);


    }
}
