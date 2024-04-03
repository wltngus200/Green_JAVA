package com.green.day15.ch7;

public class AbstractTest {//추상
    public static void main(String[] args){
        //Dog d=new Dog();//추상 클래스는 객체화 불가능
    }
}
abstract class Dog{//아무것도 없어도 추상 클래스로 가능 //객체화를 막기 위한 방법 중 하나
    //추상 클래스는 객체화 불가능 상속 받은 자식은 가능 //추상 클래스=오직 부모역할을 하기 위한 클래스로 생각
    // 캐릭터라는 것의 하위 항목(궁수, 검사, 마법사)

}
abstract class Cat{//클래스는 단 하나의 추상 클래스만 있어도 추상 클래스가 됨
    //그 외에는 모두 자유 일반 메소드, 멤버필드 가능
    abstract void crying();//선언부만 있고 구현부는 없는 메소드에 무조건 추상(abstract)을 넣기
    //무조건 오버라이딩 해야한다는 강제성이 있음
}
class KoreaShortCat extends Cat{
    @Override
    void crying(){
        System.out.println("야옹~");
    }
}
class AmericaCat extends Cat{
    @Override
    void crying() {
        System.out.println("meow~meow~");
    }
}