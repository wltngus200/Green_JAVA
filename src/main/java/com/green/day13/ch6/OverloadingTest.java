package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args){

    }
}
//오버로딩:같은 이름의 메소드를 여러개 작성하게 해주는 기술(객체지향 언어의 특징)
//오버로딩은 매개변수로 구분만 가능하면 작성가능(리턴타입은 관계없다)
//이름이 달라도 파라미터가 같으면 안 됨


class MyMath3{
    int add(int n1, int n2){
        return n1+n2;
    }
    void add(int nn1, double nn2){

    }
}