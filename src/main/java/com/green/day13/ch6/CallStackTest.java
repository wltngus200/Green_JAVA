package com.green.day13.ch6;

public class CallStackTest {
    public static void main(String[] args){//p.262
        firstMethod();//메소드 호출(객체화 없이 호출=스태틱메소드 호출)
        //Math.random();처럼 클래스.메소드 이름을 했을 텐데 그러지 않았다=현재 클래스에 있다
        //CallStackTest.firstMethod();로도 가능하나 많진 않다//현재 클래스의 이름
        //메소드 안에도 메소드 호출 가능
        //JVM에 메인메소드 호출>첫번째 메소드 실행>그 안의 세컨드 메소드
        //실행되면서 메모리 올라가고 리턴(생략됨)에서 메모리에서 빠짐(인스턴스도 마찬가지)
        System.out.println("-----------------");
    }
    public static void firstMethod(){
        System.out.println("call firstMethod");
        secondMethod();
    }
    public static void secondMethod(){
        System.out.println("call secondMethod");
    }
}
/*
스택메모리와 힙메모리 영역=명확하게 영역이 구분이 지어져있지 X
메모리 내에서 크롬영역 소프트웨어 영역 할당(왼쪽에서 반=스택으로 오른쪽 반은 힙heap으로)
스택메모리 FILO=먼저 들어온 게 나중에 나간다=컵에 물이 층층히 담김(빠져나가는 것=팝)->재귀호출을 이해하는데 도움됨
힙메모리 FIFO=먼저 들어온 것이 먼저 나감=반월당 13번출구 에스컬레이터처럼 좁은 길에서 사람들이 빠져나가는 모습
 */