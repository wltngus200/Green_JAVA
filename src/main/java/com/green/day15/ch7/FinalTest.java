package com.green.day15.ch7;

public class FinalTest {
    public static void main(String[] args){
        Car c=new Car(200);
        //c.cc=100;
        Car c2=new Car(300);
        //c.cc=200;
    }
}
class Car{
    final int CC;//매개변수 값이 변하지 않을 경우 final로 붙이면 조금 빠름
    Car(){
        CC=100;
    };
    Car (int cc){//생성자를 사용하면 레이지 처리 Lazy
        this.CC=cc;//지역변수 멤버변수
    }
}

final class Suv extends Car{//생성자에 파이널=얼려버린다는 상속금지느낌
    //생성자 문제
    //자식이 객체화 하려면 부모도 객체화
    //1. 부모에게 기본 생성자를 넣어준다. 2. 자식클래스 생산자에 해당 파라미터 값을 넣어준다
    final void start(){
        System.out.println("자동차 시동을 건다");
    }
}
//class Tucson extends Suv{
//    void start(){
//        System.out.println("자동차시동을 건당");
//메소드에 파이널이 붙으면 오버라이딩이 안 됨
//   }//위처럼 상속 금지
/*Final=금지 느낌!
클래스 앞 파이널은 상속받을 수 없다.
implements 옆에 뜨는 것 인터페이스
클래스는 단일상속 인터페이스는 다중상속 가능
메소드 앞에 파이널 (호출은 됨) 오버라이딩이 안 됨
부모가 가진 메소드를 자식이 새롭게 재정의 하는 것=오버라이딩
그 메소드를 호출하면 자식의 메소드를 먼저 호출

생성자: 클래스와 이름이 동일+리턴타입이 없다
 */