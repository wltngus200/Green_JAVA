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
    Tiger(){//기본생성자
        super();//부모의 생성자 호출 이 경우 애니멀
        //해결방법 1 부모의 기본생성자를 부르면서 객체화를 하니 애니멀에 기본 생성자를 만들어줌
    }//타이거가 객체화 하면 부모가 객체화 타이거-애니멀-오브젝트(내부적으로 서로 연결)
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
//
