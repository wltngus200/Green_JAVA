package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args){
        /*
       가이드 "숫자를 입력하세요" 예)12345 정수로 받는다
       1+2+3+4+5처럼 각 자리 수 합 10으로 나눈 나머지 구하고 10으로 나누고 의 반복
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요>>");
        int num=scan.nextInt();
        int plus=0;
        while(num>0/*num!=0*/){
            plus+=num%10;
            num=num/10;
        }System.out.println(plus);
    }
}
