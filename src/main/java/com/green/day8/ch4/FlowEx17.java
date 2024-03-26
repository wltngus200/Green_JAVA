package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args){
        //스캐너 이용 정수 입력
        //입력받은 변수로 별 찍기 삼각형
        //각 줄 수마다 숫자가 달라진다->달라지는 값을 주어야함

        Scanner scan=new Scanner(System.in);
        System.out.print("몇 줄의 별을 찍을까요");
        int star=scan.nextInt();
        for(int i=0;i<star;i++){
            for(int s=0;s<=i;s++){
                System.out.print("*");
            }System.out.println();
        }

    }
}
