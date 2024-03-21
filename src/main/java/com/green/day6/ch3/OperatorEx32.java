package com.green.day6.ch3;

public class OperatorEx32 {
    public static void main(String[] args){
        int x,y,z;
        int absX,absY,absZ;
        int signX,signY,signZ;

        x=10;
        y=-5;
        z=0;

        absX=(x>0?x:-x);
        absY=(y>0?y:-y);
        absZ=(z>0?z:-z);

        signX=(x==0?' ':(x<0?'-':'+'));//조건식 안에서 조건식 빈칸 문자 주의!
        signY=(y==0?' ':(y<0?'-':'+'));//조건식 안에서 조건식 빈칸 문자 주의!
        signZ=(z==0?' ':(z<0?'-':'+'));//조건식 안에서 조건식 빈칸 문자 주의!
        //프론트에서는 분기문을 못 써서 사용

        System.out.printf("x=%d%c\n",absX,signX);//c가 캐릭터고 d가 정수?
        System.out.printf("y=%d%c\n",absY,signY);//c가 캐릭터고 d가 정수?
        System.out.printf("z=%d%c\n",absZ,signZ);//c가 캐릭터고 d가 정수?

    }
}
