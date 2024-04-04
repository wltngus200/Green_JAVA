package com.green.day4;

public class VarScope {
    public static void main(String[] args){
        //스코프:변수가 선언이 되면 그 변수를 감싼 중괄호
        //중괄호 바깥에선 변수가 비활성화

        if(1>0){
            int num=10;
            System.out.println(num);
        }
        //System.out.println(num);//중괄호 바깥이라서 비활성화

        if(1>0){
            int num=15;
            System.out.println(num);
        }

        for(int i=0;i<5;i++){//i는 바깥에 있지만 이 안의 함수로 취급됨
            System.out.print("*");
        }

        for(int i=0;i<5;i++){//i는 바깥에 있지만 이 안의 함수로 취급됨
            int b=0;
            b=b+i;//해도 위에서 0으로 돌려버림
            //변수초기화는 반복문 바깥에서
        }
        int i=0;
        for(/*blank*/;i<5;i++){//i는 바깥에 있지만 이 안의 함수로 취급됨

        }
        System.out.print(i);
        //
    }
}
