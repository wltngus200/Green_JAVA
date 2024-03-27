package com.green.day10;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args){
        int[] score={100,88,100,100,90};
        //학생들의 국어점수입니다 총점과 평균점 출력

        int sum=0;
        for(int i=0; i<score.length; i++){
            sum+=score[i];
        }System.out.printf("학생들의 총점은 %d입니다.\n",sum);
        System.out.printf("학생들의 평균은 %.2f입니다.\n",(double)sum/score.length);
        //프린트 포맷의 소수점 버림 .n!
    }
}
