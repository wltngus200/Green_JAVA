package com.green.day6.ch3;

public class OperatorEx22 {
    public static void main(String[] args){//p.110
        float f=0.1f;//뒤로 보이지 않는 숫자 존재 0.10000000014901161
        //위가 이미 망가졌다
        double d=0.1;//0.100000000000001
        double d2=f;
        System.out. printf("%f==%f %b\n",f,d,f==d);
        System.out. printf("%f==%f %b\n",10.0,10.0f,10.0==10.0);
        //10.0=소수점 이하 0000 실수가 있고 없고의 차이
        //22 자연수의 플로트 더블은 ==으로 동일이라 나오지만 소수점의 값을 지닌 애는 아님
        System.out.printf("%f==%f %b\n",f,d,(double)f==d);
        System.out.printf("%f==%f %b\n",f,d,f==(float)d);
        //더블을 플롯으로 변경하고 연산하는 게 낫다
        //덜 망가진 애를 더 망가뜨린다

    }
}
