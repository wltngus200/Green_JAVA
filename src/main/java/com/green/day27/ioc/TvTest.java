package com.green.day27.ioc;

import com.green.day27.Tv;
import com.green.day27.ioc.TvFactory;

public class TvTest {
    public static void main(String[] args){
        TvFactory tvFactory=TvFactory.getInstance();
        String tvName=args[0];
        String speakerName=args[1];
        String wooferName=args[2];
        Tv tv=tvFactory.factory(tvName, speakerName, wooferName);
        tv.sound();
        //상단바의 실행 디버그 왼쪽 화살표에서 에디트
        //빌드 앤 런에 입력(스페이스로 구분)
        //ioc이기 때문에 가능
    }
}
