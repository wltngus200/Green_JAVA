package com.green.day11.ch6;

public class Tv {
    //지금까지의 ...? 메인 클래스에
    String color;//속성 값을 저장할 수 있는 공간 //객체입장에선 그냥 문자열 //단순 의미부여(하지만 그대로 사용해야 헷갈리지 X)
    boolean power;//객체가 가진 속성값 //아래에서 계속 속성이 바뀜
    int channel;
    //no usages를 끄는 법: 세팅>에디터>inlay hints>code bision>usages 체크
    //모두 다른 공간 가짐 이 값을 수정하면 해당하는 공간 안에서 수정
        //3가지 값 저장

    //메소드..?
    //여러개의 값을 가질 수는 있다??
    //외부의 값을 바꿀 수 있다 (심장이 안 뜨는 사람=외부에서 심장을 뛰게 만듦)
    //밀접하게 관련된 값을 변경......?
    //메소드와 값은 밀접하게 관련되어 얇은 막 형성
    //객체는 ㅡㅅ스로 호흡. 메소드는 누가 해줘야된다??????????

    //아래 멤버 메소드 //위 멤버필드??
    void power(){//메소드
        power=!power;//toggle 전원 크고 껴기 나의 속성값을 변경
    }
    void channelUp() {
        channel++;
    }
    //메소드는 외부에서 값을 받을 수 있다 ()를 통해 받음 현재는 닫혀있다.
    void channelDown() {
        channel--;
    }
    //퍼블릭을 사용할 수 있나 없나. 퍼블릭있으면 누구나 공유, 퍼블릭 없으면 같은 패키지 안에서만 사용가능(ch6)
    //프라이빗, 프로텍티드, 퍼블릭 없이, 퍼블릭 있게 종류
}
