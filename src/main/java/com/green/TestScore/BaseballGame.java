package com.green.TestScore;

import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //3자리 랜덤수, 1자리 수씩 추출, 볼, 스트라이크, 아웃
        //자리수+숫자 맞으면 스트라이크, 숫자만 맞으면 볼, 아무것도 안 맞으면 아웃
        //자리수 상관 없이 대조해 보는게 문제네?

        int num=(int)(Math.random()*100.0)+101;

        String answer=Integer.toString(num);//두개 중 하나만?아녀?
        answer.toCharArray();//int를 문자의 배열로!
        //3자리 숫자를 만들고 그것을 문자열로.

        System.out.print("숫자를 입력하세요.");
//String arr[]=스트링이 여러개인 배열

        //for(int i=0;i<answer.length();i++){
//            char a=answer.charAt(0);
//            char b=answer.charAt(1);
//            char c=answer.charAt(2);
//        if(a)

        System.out.printf("%d strike, %d ball, %d out");

    }
}
