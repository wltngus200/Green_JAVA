package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args){
        /*
        입력된 정수값이 3이라면

        --*
        -**
        ***

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("몇 줄의 별: ");
        int star=scan.nextInt();

        for(int i=0;i<star;i++){
            for(int j=star-1;j>i;j--){
                    //첫 줄에 별이 하나로 시작해 이후로 총 문자 개수가 star이하로
                    //star만큼 반복+별 1개면 star보다 크기 때문에 -1
                    System.out.print("_");
            }
            for(int s=0;s<=i;s++){
                System.out.print("*");
            }System.out.println();
        }//변하는 값을 활용 star는 고정값

        System.out.println();

        /* 선생님 풀이~~~~~~~~~~~
        for(int i=1;i<=star;i++){i=행의 수=각 줄의 별의 수
            for(int z=star-i;z>0;z--){//
                System.out.print("_");
                }
            for(int z=0;z<i;z++){
                System.out.print("*");
            }
            System.out.println();
            }
         */
        //for문 2개와 if문
        for(int x=star;x>0;x--){
            for(int z=1;z<=star;z++){//조건식에 최대한 연산 안 주는 게 best
                //언더바 x값보다 z값이 작은 동안 언더바
                if(z<x){//삼항식으로 하면 더 줄일 수 있다!
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
            }System.out.println();
        }

    }
}
