package com.green.day5.ch2;

public class StringEx {
    public static void main(String[] args){
        String name="ja"+"va";//="java"
        //자바라는 값을 가진 스트링 객체의 주소값이 name
        //OOP때 구체적으로 할 것

        System.out.println(name);

        String str= name+8.0;//="java8.0"
        //더하기와 문자열이 만나면 모든 것이 문자열로 바뀐다

        System.out.println(7+""+7);//="77"
        System.out.println(7+7+""+7);//="147"
        //헷갈리기 쉬우나 왼쪽부터 차례로 연산하여 나간다.
        System.out.println(7+""+7+7);//"777"
        // 714=(7+""+(7+7)) 우측에 배열해도 소괄호로 우선순위를 만들어 주면 숫자로 계산 할 수 있다.
        //21 +를 연발하면 가독성 떨어짐 스프링 빌더!
    }
}
