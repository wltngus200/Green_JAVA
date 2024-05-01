package com.green.day27.nonioc;

import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker(){
        woofer=new HanilWoofer();

    }
    //생성자 이름 클래스명과 같고 리턴타입이 없어야한다
    @Override
    public void sound() {
        System.out.println("Harman Speaker: 소리가 웅장하다.");
        woofer.soundBase();
    }
}
