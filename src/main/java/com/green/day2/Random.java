package com.green.day2;

public class Random {
    public static void main(String[] args) {
        //형변환, 타입이 안 맞으면 맞게 타입 변화를줘야한다
        //자동형변환, 강제형변환
        System.out.println(Math.random()*10.0);
        //문제가 안 터지면 자동
        int result=(int)(Math.random()*10);
        System.out.println(result);
        //문제가 터지면 강제>내가 소수점 버리겠다고 통보
    }
}
