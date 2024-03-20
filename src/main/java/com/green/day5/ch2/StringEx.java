package com.green.day5.ch2;

public class StringEx {
    public static void main(String[] args){
        String name="ja"+"va";//="java"
        //자바라는 값을 가진 스트링 객체의 주소값이 name
        //OOP때 구체적으로 할 것

        String str= name+8.0;//="java8.0"
        //더하기와 문자열이 만나면 모든 것이 문자열로 바뀐다
        System.out.println(7+""+7);//="77"
        System.out.println(7+7+""+7);//="147"
        System.out.println(7+""+7+7);//"777"
            //714=(7+""+(7+7))
    }
}
