package com.green.day27.nonioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;
    //인터페이스로 해 놓으면 실제 객체가 없어도 문제 X
    public SamsungTv(){
        this.speaker=new HarmanSpeaker();
        //객체 주소값을 수정하고 싶으면 코드를 수정해야함(Jbl스피커로 바꿀 경우)
    }
    //사용하고 싶은 객체를 직접적으로 생성 NON IOC TV->HS->HW
    //has A 관계 포함관계

    @Override
    public void sound() {
        System.out.println("SamsungTv: 소리가 난다.");
        speaker.sound();
    }
    //추상메소드를 받아서 구현이 강제


}
