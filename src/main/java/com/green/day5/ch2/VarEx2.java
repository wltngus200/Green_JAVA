package com.green.day5.ch2;

public class VarEx2 {
    public static void main(String[] args){
        int x= 10, y=20;
        System.out.println("x:"+x+" y"+y);

        //두 수를 서로 교환한다 단 숫자를 사용할 순 없다.
        //스와핑
        int a=x;
        x=y;
        y=a;
        System.out.println("x:"+x+" y"+y);//x:20, y:10이 출력

    }
}
