package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args){
        //오버플로우 위로 값이 넘쳐버리는 것
        //범위 이상의 값이 나왔다 다시 첫 시작으로
        int i=128;
        byte b=0;//-128~127까지
        b=(byte)i;
        System.out.println(b);//127은 버려지고 1만 남아 자신의 범위의 첫 값(순환)
        if(Byte.MAX_VALUE>=i){//바이트의  wrapper레퍼타입?
            b=(byte)i;
        }
        System.out.println("b: "+b);
        System.out.println("-오버플로우!-");


        //언더플로우 아래로 값이 넘치는 것
        //값 범위보다 더 작은 값이 나왔다
        //작다 mean 범위 내 마이너스 보다 더 작은 값
        int i2=-129;//프라머티브 타입 쓰는 이유=처리속도가 빠름
        byte b2=(byte)i2;
        System.out.println("b2: "+b2);

        if(Byte.MIN_VALUE<=i2){//방지를 하고싶다면 값을 넣기 전에 체크
            b2=(byte)i2;
        }
        System.out.println("b2: "+b2);
        System.out.println("-언더플로우-");
    }
}
