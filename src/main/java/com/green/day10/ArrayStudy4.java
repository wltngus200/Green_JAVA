package com.green.day10;

import java.util.Arrays;

public class ArrayStudy4 {
    public static void main(String[] args){
        //딥카피 다른 위치에 똑같은 집을 지음
        //자바에서 주는 기능이 있으나 사용하지 않고 만듦
        int[] nArr1={10,20,30,40};
        int[] nArr2=new int[nArr1.length]; // 같은 크기의 집을 지음 //length적극 활용

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        for(int i=0;i<nArr1.length;i++){
            nArr2[i]=nArr1[i];
        }
        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));
    }
}
