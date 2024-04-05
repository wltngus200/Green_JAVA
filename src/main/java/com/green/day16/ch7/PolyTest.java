package com.green.day16.ch7;

public class PolyTest {
    public static void main(String[] args){
        Animal ani_1=new Dog();
        Animal ani_2=new BullDog();//레퍼런스끼리의 형변환이 가능한 건 상속만 가능
        Animal ani_3=new Cat();
        //타입(형태) =  객체
        //더 작은 애가 더 큰 애를 담는 변수와는 반대
        //도그가 알고 있는 메소드가 더 많음 dog:니가 원하는 거 다 알고 있고 더 알고 있다
        //왼쪽에 있는 애가 오른쪽 애에게 요구를 했을 때 들어줄 수 있느냐의 문제
        //Dog dog2=new Animal(); Dog->Animal sleep해줘 = X
        Dog dog=new BullDog();

        //대전제 3
        ani_1.crying();//객체 기준이기 때문 ani_1이 가진 주소값이 dog객체 이기 때문에 거길 먼저 찾음
        //ani_1.sleep(); Animal이 sleep를 모르기 때문에 안 됨
        Dog dog_4=(Dog)ani_1;
        dog_4.sleep();

        //ani_2=sleep();
        Dog dog_5=(Dog)ani_2;
        dog_5.sleep();
        BullDog bulldog_5=(BullDog)ani_2;
        bulldog_5.sleep();
        //두가지는 ani_2를 쉘로우 카피 해 같은 주소값=같은 결과
    }
}
/*
다형성 대전제
    1. 부모타입의 변수는 자식 객체의 주소값을 담을 수 있다.
    2. 자식타입의 변수는 부모 객체의 주소값을 담을 수 없다
    //Dog dog2=new Animal();
    //Dog dog3=(Dog)new Animal(); 강제형변환도 안 됨
    //Dog dog_4=ani_2(불독객체를 담고 있어도)에러 타입이 부모타입이기때문
    //Dog dog_4=(bullDog)ani_2 강제형변환
    3. 타입은 알고있는 메소드만 호출 될 수 있고, 실행되는 기준은 객체 기준이다
    //멤버필드는 프라이빗으로 막을 것이기 때문에 상관 x
 */
class Animal{
    void crying(){
        System.out.println("동물이 운다");
    }
}
class Dog extends Animal{
    void crying(){
        System.out.println("강아지가 멍멍");
    }
    void sleep(){
        System.out.println("강아지가 잔다.");
    }
}
class BullDog extends Dog{
    void crying(){
        System.out.println("불독이 월월");
    }
    void sleep(){
        System.out.println("불독이 잔다.");
    }
}
class Cat extends Animal{
    void crying(){
        System.out.println("고양이가 야옹");
    }
}
