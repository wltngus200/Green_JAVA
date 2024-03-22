package com.green.day6.ch3;

public class OperatorEx6 {
    public static void main(String[] args){
        byte a=10;
        byte b=20;
        byte c=(byte)(a+b);//더하기를 쓰면 무조건 인트로 바뀜
        //바이트+바이트를 해도 인트로 연산해버림
        System.out.println(c);

        short d=10;
        short e=20;
        short f=(short)(d+e);//short도 그렇다

        int s= 1_000_000;//자리수 구분은 언더바
        System.out.println(s);

        //p.98

        long h=1_000_000*1_000_000;
        long i=1_000_000*1_000_000L;
        //int*int=인트를 벗어남->오버플로우가 롱에 저장된 것 뿐
        //day5 ch2 PrintFormat 보면 L로 롱타입 설정

        System.out.println("h: "+h);//h: -727379968
        System.out.println("i: "+i);


        double g=10/3;
        //int/int=int 소수점(실수)는 이미 날아가고 그게 더블로 들어감
        //더블을 살리고 싶으면 둘 중 하나를 더블로 만들어준다
        System.out.println("g: "+g);

    }
}
