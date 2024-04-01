package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args){//메인메소드=소프트웨어의 시작점 JVM이 가장 먼저 찾는 존재
        MyMath myMath =new MyMath();//객체화
        myMath.add(7,3);//기능 수행
        myMath.add(100,200);//기능 수행
        myMath.minus(500,400);//void 메소드는 혼자서 작동
        myMath.minus(900,25);//호출 할 때 메모리 할당 x
        System.out.println(myMath.returnAdd(50,20));//호출한 부분이 리턴한 값이 됨 //리턴메소드
        int a=myMath.returnAdd(50,20);//리턴메소드는 단독으로 쓰이지 않음. (대입,출력)
        //myMath.로 위치를 알 수 있다
    }
}
class MyMath{
    //접근제어자:디폴트 같은 클래스, 같은 패키지에서 사용
    //클래스 //static이 안 붙으면 사용하고 싶으면 무조건 객체화
    void add(int n1, int n2) {//메소드
        System.out.printf("%d+%d=%d\n", n1, n2, n1 + n2);
        //메소드의 구성요소= 리턴타입void 메소드명add 파라미터(int n1, int n2)->메소드의 선언부
        //파라미터=외부에서 값이 들어오는 통로, 리턴=내가 내부의 값을 던질 수 있는 통로->이 둘이 있고 없고 따라 4가지 경우의 수
        /*
        리턴 메소드, 보이드 메소드 (선생님의 용어)
         */
    }
    int returnAdd(int n1, int n2){
        return n1+n2;//값을 가지고 돌아올 것
    }//리턴 메소드는 가공만 하고 값을 던져버림

        //{}는 메소드의 구현부//인터페이스에서 선언부?만 적음
    void minus(int n3, int n4){//인수명이 위의 메소드와 겹쳐도 상관 없다=다른 스코프 (매개변수지만 지역변수와 같음)
        System.out.printf("%d-%d=%d\n",n3,n4,n3-n4);
        //void타입= return; 을 입력하지 않아도 자동으로 입력됨
    }

    //아래와 같은 경우도 존재할 수 있음
    void method1(){
    }
    int method2(){
        return 10;
    }
}
