package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args){

    }
}
class Animal{
    int age;
    Animal(){//기본생성자
        super();//부모의 생성자 호출 이 경우는 오브젝트
    }
    Animal(int age){//정수값을 받는 생성자만 존재
        this.age=age;//해결방법 2 정수값을 받길 원하는 부모생산자에 정수값을 받음
    }//기본생성자를 일부러 제거했다고 판단하고 기본생성자를 안 넣어줌
}
class Tiger extends Animal{
    String name;
    //Tiger(){//기본생성자
    //    super();//부모의 생성자 호출 이 경우 애니멀
        //해결방법 1 부모의 기본생성자를 부르면서 객체화를 하니 애니멀에 기본 생성자를 만들어줌
    //}//타이거가 객체화 하면 부모가 객체화 타이거-애니멀-오브젝트(내부적으로 서로 연결)
    //해결방법 2
    Tiger(int age){
        //super();로 적으면 에러 부모생산자에 int값을 넣어주어야 하는데 들어갈 수 없음
        super(age);//해결방법 2의 일부
    }
    //Tiger(){
    //    super(10);
    //} 해결방법 2의 일부
    Tiger(int age, String name){//해결방법 2의 일부
        super(age);
        this.name=name;
    }
}
/*
조상클래스에 기본생성자가 아닌 생성자가 있을 때, 컴파일러는 기본 생성자를 생성하지 않음
이 때 자손 클래스에 빨간 줄이 뜬다. 자손 클래스에 super를 포함한 기본 생성자를 넣으면
super에 빨간 줄이 뜨는데 조상 클래스에 필요한 매개변수가 들어가지 않기 때문
Tiger에 인수를 넣기, Animal에 기본생성자 넣기

호출:super(); 호출하고 싶은데 인수가 없어서 안 됨
사용:

this. 멤버필드(전역변수), 메소드
this() 다른 생성자 소환(자기 자신을 호출하면 무한루프)

생성자는 특별한 메소드 메소드 안에서 super() 호출 불가능(최초 딱 1번)
생성자에서는 메소드 호출 가능
생성자를 쓰는 이유:생성과 동시에 멤버필드 초기화를 위해 (객체 생성을 위해서가 제 1 순위 이유 )

extends:상속의 키워드(확장되다)
코드가 복사되어 들어오는 것이 아니라 자식클래스가 객체화 할 때 부모클래스도 객체화 함

 */
