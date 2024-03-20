package com.green.day5.ch2;

public class VarEx1 {
    public static void main(String[] args){
        int year ='A';//변수 선언+초기화 //''는 문자기때문에 설정가능
        int age=14;
        System.out.println(year);//변수를 넣으면 읽기를 함
        System.out.println(age);
        int year2=0, age2=14;
        year=age+2000;
        age=age+1;
        System.out.println(year);//2014
        System.out.println(age);//15

    }
}
