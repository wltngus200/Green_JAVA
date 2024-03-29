package com.green.day12.ch6;

public class MyMethodTest {
    public static void main(String[] args){
        MyMethod mm=new MyMethod();//MyMethod를 mm으로 객체화
        mm.checkOddEven(71);//홀,짝수입니다 mm으로 객체화 된 MyMethod안의 checkOddEven 메소드
        mm.checkOddEven(29);//홀,짝수입니다
        mm.checkOddEven(36);//홀,짝수입니다
        mm.checkOddEven(54);//홀,짝수입니다

    }
}
//클래스 안에는 비슷한 것 끼리 모아야 함
class MyMethod{
    void checkOddEven(int n){
        String an=(n%2==0?"짝수":"홀수");
        System.out.printf("입력하신 숫자는 %d이며, %s입니다.\n",n,an);//한 줄로도 가능
    }
}
