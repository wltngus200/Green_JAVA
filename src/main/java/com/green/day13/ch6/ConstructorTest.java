package com.green.day13.ch6;

public class ConstructorTest {//생성자 p.291
    public static void main (String[] args){
        Data1 d1=new Data1();//Data1(); 생성자라는 메소드
        //클래스 타입(<->프로토타입)객체지향 언어는 객체를 생성할 때 생성자를 호출해야한다.
        // 1. 객체 생성때만 사용. 생성후에는 호출 불가 new키워드를 통해서만 생성 가능
        //d1.Data1();//생성 후에는 호출 불가
        Data2 d2_1=new Data2();
        Data2 d2 =new Data2(10);

        //작성법(조건) 1. 클래스와 같은 이름 2. 리턴타입이 없다.(void String int ...=>메소드와의 구분점
        //존재이유 1. 객체생성 하기 위해 2.생성과 동시에 멤버필드 초기화
        System.out.println("d1.value "+ d1.value);
        System.out.println("d2.value "+d2.value);
        System.out.println("d2_1.value "+d2_1.value);//아무것도 수정하지 않고 100이 나오게

    }
}
class Data1{
    int value;
    //퍼블릭 아무데서나 할 수 있게, 같은 클래스일 경우 생략, 프라이빗도 붙이는 것이 가능
    public Data1(){//파라미터가 없는 생성자=기본생성자 없을 경우(다른 생성자가 없을 때) 컴파일러가 자동으로 추가
        System.out.println("Data1 생성자 호출!!");
    }
    //private 하면 외부에서 접근 못해서 객체 생성을 할 수 없다->이런 경우도 있음
    //ex.캐릭터마다 가지는 공통의 속성 hp을 퍼블릭으로 주고 상속시킨다(캐릭터가 부모역할-네크로맨서, 소서러가 자식)

}
class Data2{
    int value; //여기에 숫자를 붙이면 명시적 초기화 p.301//초기화 블럭이라는 것도 있으나 잘 쓰지 않음
    public Data2(){
        value=200;//생성과 동시에 초기화
    }//아무런 생성자 없을 경우만 기본 생성자(파라미터X) 호출, 필요하다면 직접 기입
    //this super
    public Data2(int param){
        value=param;
    }
}