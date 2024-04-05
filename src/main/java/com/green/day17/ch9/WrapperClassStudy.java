package com.green.day17.ch9;

public class WrapperClassStudy {
    public static void main(String[] args){
        //Integer i=new Integer(100); deprecated 곧 사라질거라는 통보
        Integer i=100;
        /*int i2=100;
        System.out.println(i==i2);//true*/
        Integer.parseInt("100"); //스태틱
        //오버플로우 언더플로우
        //Integer.MIN_VALUE;
        //Integer.MAX_VALUE; //f라고 나오는 것 멤버필드
    }
}
