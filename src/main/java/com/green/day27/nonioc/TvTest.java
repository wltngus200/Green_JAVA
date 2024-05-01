package com.green.day27.nonioc;

import com.green.day27.Tv;
import com.green.day27.ioc.TvFactory;

public class TvTest {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        String tvName = "apple";
        String speakerName = "genelec";
        String wooferName = "hanil";
        Tv tv = tvFactory.factory(tvName, speakerName, wooferName);
        tv.sound();
    }
}
