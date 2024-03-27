package com.green.TestScore;

import java.util.Arrays;

public class ArrayOneTwoThree {
    public static void main(String[] args){
        //배열의 숫자들을 작은 순서대로 배열하기
        int[] a =new int [10];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(a));
        int b;
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
             b=min;
             min=a[i];
             a[i]=a[i-1];
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
