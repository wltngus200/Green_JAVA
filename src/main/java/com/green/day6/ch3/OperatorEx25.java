package com.green.day6.ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char ch=' ';//스페이스도 문자 스페이스 필요 빈칸 X
        System.out.print("문자를 하나 입력하세요");//여러 글자 넣어도 하나만 들어감
        String input = scan.nextLine();
        ch=input.charAt(0);//at : ~에 있다//0은 첨자
        //문자 열=문자의 배열을 의미(0~n층 아파트 층마다 한 칸씩 저장)
        if('0'<=ch&&ch<='9'){//ch안의 문자가 0~9사이인지 보는 것
            System.out.println("입력하신 문자는 숫자입니다.");}
        else if('a'<=ch && ch<='z'){
            System.out.print("입력하신 문자는 소문자입니다.");}
        else if('A'<=ch && ch<='Z'){//따옴표와 쌍따옴표 구분!
            System.out.print("입력하신 문자는 대문자입니다.");}
        }


        /*
        String str="abcdefg";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        */




}
