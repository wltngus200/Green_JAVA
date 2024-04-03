package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args){
        Parent p=new Parent(55);
        Child child=new Child();
        //Child child = new Child();
        //child.attack();
        System.out.println(p.age);
        child.doubleAttack();
    }
}
class Parent{
    Parent(){}
    int age;//전역변수에 값을 넣으려는 이유=지역변수는 스코프를 벗어나면 사라짐 //주소값
    //public Parent(){} 기본생성자 생략
    //생성자와 메소드의 특징 1. 클래스와 이름이 같아야 한다 2. 리턴타입이 없어야 한다

    Parent(int age){
        super();
        this.age=age;//this 객체의 자신을 가리키는 상수 //내가 만약 객체가 된다면 객체의 주소값을 this에 넣겠다. ????????
        //this.메소드, 전역변수 //this(생성자); //생성자는 객체 호출할 때 1번만 사용//생성자 호출은 생성자만 가능
    }//Parent p=new Parent(55);를 정상적으로 작동하게 하면 차일드가 안되게 됨!

    void attack(){
        System.out.println("부모가 적을 공격한다!");
    }
    public void defense(){
        System.out.println("부모가 적의 공격을 방어한다!");
    }
}

class Child extends Parent{
    public Child(){
        super();//this()와 거의 흡사, 가리키는 대상이 직속 부모로 바뀔 뿐 //기본 생성자 호출
        //Parent에 기본 생성자가 없으면 에러! 없으면 있는 생성자 사용
    }
    int mzPower;
    @Override //애노테이션 Annotation: 진짜 오버라이딩이 맞는지 체크
    //부모중에 똑같이 생긴 메소드가 있어야 됨
    void attack(){
        System.out.println("자식이 적을 공격한다!!!");
        super.attack();//부모와 자식 모두 출력하고 싶다
    }//오버라이딩은 덮어쓰기(원본이 지워지지는 않음)

    public void doubleAttack(){
        this.defense();//나를 먼저 찾아보고 없으면 부모실행
        super.defense();//바로 부모의 것을 실행
        System.out.println("-----");
        this.attack();
        super.attack();
    }//오버라이딩이 안 되어있으면 디스나 수퍼나 똑같다
}