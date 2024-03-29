package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args){
        System.out.println(Card.width);//static이라 객체화가 필요 없음! //'클래스 이름.'= System.out도 스태틱
        System.out.println(Card.height);

        Card.width=110;

        System.out.println(Card.width);

        //Card.kind="" X 안 됨 //객체화가 안 되어서
        Card c1=new Card();//객체화
        c1.kind="Heart";
        c1.number=7;
        System.out.printf("c1.kind: %s, c1.number: %d\n",c1.kind,c1.number);
        System.out.println(c1.width);//사용은 되나 static은 이러한 사용을 지양
        System.out.println(c1.height);//사용은 되나 static은 이러한 사용을 지양

        Card c2=new Card();
        c2.kind="Spade";
        c2.number=4;
        System.out.printf("c2.kind: %s, c2.number: %d\n",c2.kind,c2.number);
        System.out.println(c2.width);//사용은 되나 static은 이러한 사용을 지양
        System.out.println(c2.height);//사용은 되나 static은 이러한 사용을 지양

    }
}
