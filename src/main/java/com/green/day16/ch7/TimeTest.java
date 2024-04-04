package com.green.day16.ch7;

public class TimeTest {//앞으로 멤버변수는 프라이빗
    public static void main(String[] args){
        Time time = new Time(10,11,12);
        //time.hour=10; 캡슐화 혹은 은닉화 외부에서 접근할 수 없다
        System.out.printf("hour: %d\n",time.getHour());
        time.setHour(22);
        System.out.printf("hour: %d\n",time.getHour());

    }
}
class Time{//프라이빗=이 클래스 내에서만 사용
    //사람을 보자마자 이름 나이등을 알수 없듯 객체도 속성은 은닉화
    //싱글톤: 객체인데 스태틱처럼 사용(객체를 하나만 만들어서 여러번 돌려씀)
    //은닉화를 하지 않으면 A가 사용중인데 B가 변경을 해버릴 수 있다
    //값을 넣는 방법이 2가지 값을 출력하는 방법이 1개
    //은닉화 하지 않는 멤버필드=상수(값 변경이 불가능하기 때문)
    //프라이빗한 멤버필드에 값을 넣는 방법
    //      1.생성자(객체화 시 최초 1번만 넣을 수 있다.)
    //      2.메소드를 통해서 (setter)
    private int hour;//프라이빗이 안 되면 -5시간 28시간 등 가능 //순서라는 것도 생김
    private int minute;
    private int second;

    Time(int hour, int minute, int second){//넣을 때만 쓸 수 있다.
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }


    public void setHour(int hour) {//오픈된 곳=통제 X 백화점의 입구 같은 역할 =통제 (if문)
        //멤버필드의 값 무결성화
        this.hour = hour;
    }

    public void setMinute(int minute) {//자바의 라이브러리의 규칙을 준수해야함
        //set+(첫글자 대문자)멤버필드명(카멜케이스기법) 멤버필드 변경시킬 값(타입 맞출 것)
        //세터는 전부 void 출력할 필요x
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    //값을 불러내는 법=메소드

    public int getHour() {//리턴타입을 규정, 파라미터 X
        return hour;//this.hour도 상관 없다
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
