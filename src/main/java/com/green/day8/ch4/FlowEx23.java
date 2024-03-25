package com.green.day8.ch4;

public class FlowEx23 {
    public static void main(String[] args){
        //i++과 ++i의 차이!
        int i=5;
        while(i!=0){//for문
            System.out.printf("%d-I can do it.\n",i/*(i--)*/);
            i--;
        }System.out.print("-END-");

        int x=5;
        while(x!=0){
            System.out.printf("%d-I can't do this.\n",--x);
        }System.out.print("-END-");
    }
}
