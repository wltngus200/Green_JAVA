package com.green.day2;

public class Var2 {
    public static void main(String[] args) {
        int globalNum;//전역변수
        //지역변수는 초기화 필수!
        //변수선언과 동시에 초기화
        int num=10, num2=11, num3=0;
        num3=num+num2;
        num3=num3+3;
        num3++;
        System.out.println(num3);

        ++num3;
        System.out.println(num3);



    }
}
