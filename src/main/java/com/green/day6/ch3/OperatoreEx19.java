package com.green.day6.ch3;

public class OperatoreEx19 {
    public static void main(String[] args){
        int x=10;
        int y=8;
        System.out.printf("x/y=%d,x%%y=%d\n",x/y,x%y);
        //nod %가 에러를 일으켜서 %%로 수정

        int x2=7;
        System.out.printf("x2%%y=%d\n",x2%y);
        System.out.printf("x2/y=%d\n",x2/y);

        System.out.println(10%8);//2
        System.out.println(-10%8);//-2
        System.out.println(10%-8);//2
        System.out.println(-10%8);//-2
        //뒤쪽 부호는 의미 없고 앞에 거만 의미 있다


    }
}
