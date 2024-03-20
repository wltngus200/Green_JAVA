package com.green.day4;

public class LogicalOperator_not_toggle {
    public static void main(String[] args){

        //not !

        System.out.println();
        boolean s1=true&&true&&true;
        System.out.println("!!s1"+!!s1);
        System.out.println("!s1"+!s1);
        System.out.println("s1"+s1);
        System.out.println();
        //!=비교연산자
        //! 논리연산자

        //toggle 토글: 누르는 거만 가능한 버튼
        //누를 때마다 값이 바뀜(누르면 켜지고 꺼지기) like 좋아요 버튼
        boolean tg=true;
        tg=!tg;//반대로 바뀜
        System.out.println("tg:"+tg);
        tg=!tg;
        System.out.println("tg:"+tg);
        tg=!tg;
        System.out.println("tg:"+tg);
        tg=!tg;
        System.out.println("tg:"+tg);

        int tg2=0;
        tg2=1-tg2;
        //으앙

    }
}
