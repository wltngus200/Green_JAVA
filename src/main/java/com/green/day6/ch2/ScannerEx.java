package com.green.day6.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("두 자리 정수를 하나 입력해주세요.");
        String input = scan.nextLine();//"123"->123 레퍼런스에서 프라모티브 타입으로 바뀜/p40
        // int num=(int)input;는 불가하기때문에 파싱이라는 작업이 필요
        int num=Integer.parseInt(input);//문자열을 숫자로//문자는 섞이지 않아야함
        System.out.println("num="+num);
        System.out.println("num+1="+(num+1));//int에 들어갔다는 자체가 숫자임을 증명//괄호

    }
}
