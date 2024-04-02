package com.green.day14.ch7;

public class CarTest {//p.316
    public static void main(String[] args){
        // is-a has-a//00는 00냐 00는 **를 포함하고 있냐
        // 아반떼는 차이다 = is a 관계=상속으로 해결
        // 바퀴는 차? 차는 바퀴? 둘 다 아님
        // 차에 바퀴는 있나요? has a= 포함관계
        // 카드 덱이 카드를 포함하고 있다
    }
}
class Car{
    int cc;
    String company;
    Speaker speaker;//자동차의 주소 값을 알 수 있도록

    void drive(){
        System.out.println("자동차가 붕붕");
    }
}

class Abante extends Car{

}
class Speaker{
    int volume;
    void play(){
        System.out.println("음악이 흘러나온다");
    }//포함관계
}