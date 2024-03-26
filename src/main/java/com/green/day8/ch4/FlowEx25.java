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

        //선생님 풀이 switch ver도 있음
        /*
        for(int i=1;i<=100;i++){
        System.out.printf("i=%d ",i);//무조건 찍어야하는 아이
        int copy=i;//원본을 해치지 않고 각 자리수를 사용
        do{
            int oneDight=copy%10;
            if(oneDight!=0 && oneDight%3==0){//0이 아니면서 3으로 나누어 떨어지는 값
                System.out.print("짝");
            }
        }while((copy/=10)>2);
        System.out.println();
        */

        //정수값을 문자로 바꿈
        //str.toCharArray()

        //+민지님 코드
    }
}
