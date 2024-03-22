package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args){
        //오버플로우 위로 값이 넘쳐버리는 것
        //22현실에서는 넘치는 값은 소실되지만 프로그래밍에서는 넘친 값만 존재하게 됨=쓰레기값
        //범위 이상의 값이 나왔다 다시 첫 시작으로
        int i=128;
        byte b=0;//-128~127까지
        b=(byte)i;
        System.out.println(b);//127은 버려지고 1만 남아 자신의 범위의 첫 값(순환)
        if(Byte.MAX_VALUE>=i){//22감당할 수 있는 값인지 체크하고 담는다
            //22오버플로우와 언더플로우 모두를 체크해야하는데 하나만 하고 있다
            //바이트의  wrapper레퍼타입?
            b=(byte)i;
        }
        System.out.println("b: "+b);
        System.out.println("-오버플로우!-");


        //언더플로우 아래로 값이 넘치는 것
        //22 물을 빼다가 빼다가 더 빼버림 (오버플로우와 거꾸로 돎)
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

        System.out.println("=============================");

        //22추가
        int n3=10; //n3를 byte로 형변환
        //형변환 할 수 있는 값인지 체크하는 if문 작성
        byte bn3;
        if(Byte.MAX_VALUE>=n3 && Byte.MIN_VALUE<=n3){//10<n<100 안 됨
            bn3=(byte)n3;
            System.out.println("bn3: "+bn3);
        }
        System.out.println("---종료---");
    }
}
