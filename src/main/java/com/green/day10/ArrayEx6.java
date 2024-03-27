package com.green.day10;

public class ArrayEx6 {
    public static void main(String[] args){
        //min max출력
        int[] score={79,88,91,33,100,55,95};
        int min=score[0];
        int max=score[0];
        for(int i=1;i<score.length;i++){//length =7
            if(score[i]>max){
                max=score[i];
            } if(score[i]<min){ //else if여도 되는게 첫 값과 두번째 값이 같으면 둘다 실행 안 되고, 다른 값이면 값이 바뀜
                min=score[i];
            }
        }System.out.println(max);
        System.out.println(min);
    }
}
