package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args){

        long r=MyMath2.add(10,20);//static이 붙어서 바로 사용 가능
        //스태틱 메소드, 파라미터2개, 클래스이름 MyMath2, 리턴타입 long,메소드이름 add
        //스태틱과 일반 메소드 구분=객체화를 하지 않음, 주소값을 가진 객체가 아닌 MyMath
        //소괄호가 있어서 메소드인지 안다
        //MyMath가 지워져도 붉은 줄이 뜨지 않는다=같은 클래스 내에 존재

    //메소드의 소속 클래스.메소드명
        System.out.println("r: "+r);

        MyMath2 myMath2=new MyMath2();//객체생성
        long r2=myMath2.add();//클래스.메소드
        System.out.println("r2: "+r2);

    }
}
class MyMath2{
    long n1, n2;
    long add(){//객체 생성
        System.out.println("call add()");
        add(10,20);//파라미터 없으면 무한루프
        return n1+n2;//전역변수 이용
    }//인스턴스 메소드는 스태틱메소드 활용가능 //add스태틱임=파라미터 차이
    //인스턴스 메소드 사용=객체화를 해야한다 그런데 스태틱은 이미 객체에 올라있다
    static long add(long n1,long n2){//파라미터로 들어오는 것으로만 작업하면 static붙여도 됨
        //MyMath2 my2=new MyMath2();//객체화 하고 인스턴스 변수 사용 my2.n1
        return n1+n2;//메소드 호출 //지역변수=매개변수 이용(가까운 애 사용)
        //static 때문 static이 없으면 객체화 해 수동적으로 메모리에 올리는 작업이 필요
        //객체가 될 가능성이 있지만 현재같이 애매한 상황에선 전역변수 사용 X
        //인스턴스 멤버필드는 스태틱에 사용할 수 없다!
    }
}//인스턴스 쓰려면 객체화 필요! 인스턴스 메소드가 스테틱메소드 이용할 수 있다. 스테틱 메소드가 인스턴스 활용불가

