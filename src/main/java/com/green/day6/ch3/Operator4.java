package com.green.day6.ch3;

public class Operator4 {
    public static void main(String[] args){//p.96
        int i = -10;
        i=+i;
        System.out.println("i: "+i);
        //+ 부호연산자는 의미가 없다!

        i=-10;
        i=-i;
        System.out.println("i:"+i);
    }
}
