package com.green.day17.ch7;

public class AnnonymousTest {
    public static void main(String[] args) {
        Object obj = new Car();//이름을 가진 클래스 필요
        //타입은 알고 있는 메소드만 실행할 수 있다
        Object obj2=new Object(){//바로 클래스 만들고 오버라이딩 해서
            void drive(){
                System.out.println("자동차가 붕붕");
            }
            public String toString(){
                return "익명 클래스";
            }
        };
        System.out.println(obj);
        System.out.println(obj2);
    }
}
class Car{
    //@Override 오버라이딩(=재정의)이 에러가 안 뜬다는 건 부모가 이런 메소드를 가지고 있었다는 것
    void drive(){
        System.out.println("뛰뛰빵빵");
    }
}
