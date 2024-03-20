package com.green.day5;

public class Calc {
    public static void main(String[] args){
        int score=93;
        //등급을 결정하는 건 10의 자리
        int val1=score/10;
        //int로 변수를 줬기 때문에 int->double로 + 10.0으로 해야 실수
        //일의자리로는 +-를 붙여주자 0~2- 3~6 0 7~9 +
        int val2=score%10;//노드 나머지
        switch(val1){
            case 9:
            case 8:
        }
    }
}
