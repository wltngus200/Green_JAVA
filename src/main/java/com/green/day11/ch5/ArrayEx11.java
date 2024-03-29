package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args){
        int len=10;
        int[] numArr=new int[len];
        int[] counterArr =new int [len];

        //num의 모든 방에 0~9사이 랜덤값
        for(int i=0; i<numArr.length; i++){
            int rand=(int)(Math.random()*numArr.length);
            //배열의 수만큼 length를 하면 딱 배열이 감당할 수 잇는값이 나옴
            //랜덤을 통해 나온 수치가 numArr에 들어가는 랜덤값이자 인덱스값
            numArr[i]=rand;
        }System.out.println(Arrays.toString(numArr));

        //numArr의 각 칸에 들어있는 값의 개수를 counterArr에 정리
        //ex. counter[9]에 numArr의 9의 개수
        for(int j=0; j<counterArr.length; j++){
            counterArr[numArr[j]]+=1;
                //+=1 은 ++과 같다!
        /*
        int val= numArr[i]
        counterArr[val]++
         */

        //numArr의 값은 0~9 + counterArr의 인덱스도 0~9
        //numArr[i]=0이라면 counterArr[numArr[i]]=counterArr[0]

        }System.out.println(Arrays.toString(counterArr));

    }
}
