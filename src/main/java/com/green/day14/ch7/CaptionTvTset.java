package com.green.day14.ch7;

public class CaptionTvTset {
    public static void main(String[] args){
        CaptionTv cTv=new CaptionTv();
        cTv.channel=10;
        cTv.power();
        cTv.channelUp();
        cTv.channelDown();
        cTv.channelDown();
        System.out.printf("cTv.channel: " + cTv.channel+"\n");
        cTv.caption=true;
        cTv.displayCaption("ddddd");

        //자식 클래스는 부모를 상속 받으면 모든 변수를 다 가짐
        //자식이 부모보다 더 작아질 수 있는가? 일부만 받을 수 없기 때문에 같아질 순 있어도 작아질 순 없다
        //멤버필드가 프라이빗이라고 해서 이용할 수 없는 건 아님
        //메소드가 프라이빗이면 자식이 이용하지 못 할 수도있음
        //자식객체에게 부모가 있으면 부모를 먼저 객체화 하고 연결
    }
}
class Tv{
    boolean power;
    int channel;//아무리 부모라도 private를 붙이면 접근할 수 없다.

    void power() {power=!power;}//토글
    void channelUp() {channel++;}
    void channelDown(){channel--;}
}

class VideoTv extends Tv{//videoTv와 CaptionTv는 서로 남 오직 부모 클래스만 관계 //다중상속 불가능

}
//단계가 올라갈 수록 추상적 공통적인 부분으로 묶여있다 ex.동물>포유류>사자,호랑이

class CaptionTv extends Tv{//상속 키워드 extends(확장)
    //부모와 자신의 속성 모두 가짐
    boolean caption;//자막? //불린의 디폴트 값 false
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}