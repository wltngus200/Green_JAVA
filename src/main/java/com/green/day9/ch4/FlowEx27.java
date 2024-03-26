package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx27 {
    //p.172
    public static void main(String[] args){
        //가이드 출력. 합계를 구할 숫자를 입력하세요 종료:0
        //가이드 출력이 계속되고 입력한 모든 값을 마지막에 출력

        Scanner scan=new Scanner(System.in);
        int sum=0;

        while(true){
            System.out.print("합계를 구할 숫자를 입력하세요. 종료를 원한다면 0을 누르세요.");
            int num=scan.nextInt();
            sum+=num;
            if(num==0){//지금은 0이라 sum에 영향을 주지 않지만, 만약 다른 숫자가 종료키워드라면 원하는 값X
                break;
            }
        }System.out.printf("입력하신 수의 총 합은 %d입니다.\n",sum);

        int sum1=0;

        //2번째 버전
        while(true){
            System.out.print("합계를 구할 숫자를 입력하세요. 종료를 원한다면 0을 누르세요.");
            int num=scan.nextInt();
            if(num!=0){
                sum1+=num;
            }else {
                break;
            }
        }System.out.print(sum1);

    }
}
