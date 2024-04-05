package com.green.day17.ch7;

public class AnnonymousTest2 {
    public static void main(String[] args) {
       Movable m1=new MyMove();
       m1.move();

       //익명클래스 중괄호 뒤 세미콜론 //이름 없이 만드는 기법 (프론트가 잘 씀-이벤트:클릭 더블클릭 드래그 오른쪽마우스 스크롤)
        //이벤트가 발생했을때 바인딩 ~~한 거 하고싶어
       Movable m2=new Movable(){//인터페이스를 임플리먼츠 한 익명 클래스
           @Override
           public void move(){
               System.out.println("일본으로 가자!");
           }
       };
       m2.move();

    }
}
interface Movable{//얘를 객체화 하고 싶으면 기존의 방법은 상속받는 클래스를 만들고 메소드를 구현해야했다.
    //인터페이스는 객체화 할수 없다 메소드가 구현부가 없기 때문
    void move();
}
class MyMove implements Movable{
    @Override
    public void move(){
        System.out.println("서울까지 가자~~");
    }
}
