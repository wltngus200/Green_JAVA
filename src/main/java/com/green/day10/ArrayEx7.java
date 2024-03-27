package com.green.day10;

import java.util.Arrays;

public class ArrayEx7 {
    //셔플
    public static void main(String[] args){
    int[] numArr=new int[10];
    for(int i=0;i<numArr.length;i++){
        numArr[i]=i+10;
    }
    System.out.print(Arrays.toString(numArr));
    System.out.println();
    //인덱스 순서대로 마음에드는 숫자를 골라 그 방과 자리를 바꿈
    int a=0;
    for(int i=0;i<numArr.length;i++){
        int b=(int)(Math.random()*10);
        a=numArr[i];
        numArr[i]=numArr[b];
        numArr[b]=a;
    }
    System.out.print(Arrays.toString(numArr));
    }
}
