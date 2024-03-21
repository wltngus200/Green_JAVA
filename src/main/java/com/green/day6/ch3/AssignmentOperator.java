package com.green.day6.ch3;

public class AssignmentOperator {
    public static void main(String[] args){//p.132
        int x,y;
        //     left value         = right value
        //저장가능한 공간(변수 배열)  = 식 변수 리터럴
        //x=y=3; O //x=y=3=4; X (3=4에서 저장할 공간이 없음)


        //복합대입연산자
        int n=1;
        n+=1;//n=n+1;와 같다

        int k1 = 10, k2=3;
        k1%=k2;//k1=k1%k2=1
        //k1이라는 원본값이 소실되기 때문에 새로운 변수를 설정
        System.out.println("k1: "+k1);

    }
}
