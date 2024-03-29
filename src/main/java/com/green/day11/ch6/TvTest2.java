package com.green.day11.ch6;

public class TvTest2 {
    public static void main(String[] args){

        Tv tv=new Tv();
        tv.channel=10;
        Tv tv2=tv; //주소값 복사=쉘로우 카피;
        tv2=new Tv();
    }
}
