package com.green.day5.ch2;

public class DataType {
    public static void main(String[] args){
        //변수 타입

        //1. primitive type (원시타입, 기본형)
            //1) 논리형 'boolean' (true/false 값을 저장) >>21 불린을 쓰긴 하나 변수로서는 잘 쓰지 않음
            //2) 문자형 char-캐릭터 (문자 하나 저장) ex. 'a','b','가'
            //3) 정수형 byte, short, 'int', 'long'(소수점이 없는 숫자를 저장)
                //바이트 1바이트 쇼트 2바이트...=>저장할 수 있는 값이 정해져있음
                //CPU가 처리하는 단위 4바이트라서 int 주로 사용, 큰 값만 long
            //4) 실수형 'float', 'double', 소수점이 있는 숫자'도' 저장
                //플로트 4바이트(속도) 더블 8바이트(정확도) 정확한 값에 가까운 게 더블
                //저장공간이 더블이 큼, 속도는 조금 떨어짐
                    //long(8)과 float(4)를 연산 long->float으로 바뀜

        //2. reference type (레퍼런스 타입, 참조형)
            //1)객체의 주소값을 저장 (OOP의 기초!)
            //2)class를 객체로 만들기 때문에 첫글자 대문자
                //21>>클래스가 타입이 되기때문에 첫 글자 대문자
                //    여기에 저장되는 것은 무조건 객체의 주소값
    }
}
