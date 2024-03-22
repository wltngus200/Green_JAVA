package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args){
        //Scanner를 활용 콘솔에서 문자값을 받는다
        //받은 문자열을 숫자로 파싱
        //파싱한 숫자가 0이라면 입력하신 숫자는 0입니다
                //0이 아니라면 입력하신 숫자는 0이 아닙니다
                //입력하신 숫자는 ? 입니다.
        Scanner scan=new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요.");
        String xnumber=scan.nextLine();
        int number=Integer.parseInt(xnumber);//문자를 숫자로 전환

        if(number==0){
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.printf("입력하신 숫자는 0이 아닙니다.\n" +
                                                "입력하신 숫자는 %d입니다.",number);

        }
        String.format("입력하신 숫자는 0이 아닙니다. 입력하신 숫자는 %d입니다.\n",number);
        //인 풋이 목적인 것과 아웃풋이 목적인 것
    }
}
