package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class BossSpeaker implements Speaker {

    private Woofer woofer;

    public BossSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void sound() {
        System.out.println("Boss Speaker: 소리가 짱짱하다.");
        woofer.soundBase();
    }
}
