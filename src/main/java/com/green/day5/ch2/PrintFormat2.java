package com.green.day5.ch2;

public class PrintFormat2 {
    public static void main(String[] args){
        String name="홍길동";
        int age=22;
        double height=178.2;
        char bloodtype='A';
        boolean isSingle=true; //t:싱글입니다. f:싱글이 아닙니다.
        //System.out.printf("저의 이름은 %s입니다. 나이는 %s살, 키는 %scm, 혈액형은 %s형\n"
        //        , name, age, height, bloodtype);
        System.out.printf("저는 %b입니다.",isSingle);//true
        System.out.printf("저는 %b입니다.",isSingle);//true
        //전부 %s도 가능 앞서 한 것처럼 반올림내림 자리수 정렬 등을 하려면 나머지
    }
}

/*html뼈대(랭귀지)=표시!가 목적
css화장
javascript 동적 효과*/