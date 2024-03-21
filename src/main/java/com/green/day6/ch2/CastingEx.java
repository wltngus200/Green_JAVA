package com.green.day6.ch2;

public class CastingEx {//p.75~
    public static void main(String[] args){
        //primitive type, reference type 같은 카테고리끼리는 형변환 可
        //다른 타입끼리는 형변환이 안 된다(인트 <--> 스트링) 이때는 파싱처리
        // Wrapper 클래스는 제외
        int n1=10;
        Integer n2=n1;//이 두가지는 거의 비슷

        double d1=10.0;
        Double d2=d1;//==비교도 가능 거의 같음

        //자동형변환 방향 byte>short>int>long>float>double(>String)더하기 연산자일때만(p.83)
        //위의 경우에서 역행하는 경우는 무조건 "강제형변환"

        long l1=100000000L;
        float f1=l1;
        System.out.println("f1: "+f1);

        long l2=(long)f1;
        System.out.println("l2: "+l2);

    }
}
