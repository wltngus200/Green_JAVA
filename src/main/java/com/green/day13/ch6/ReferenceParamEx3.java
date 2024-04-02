package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args){
        int[] arr={3,2,1,6,5,4,10};
        System.out.println(Arrays.toString(arr));//스태틱 메소드//문자열을 만드는 것이 목적

        printIntArr(arr);//위와 결과 똑같이(변경이 있어도)
    }
    static void printIntArr(int[] newArr){
        if(newArr.length==0){
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d",newArr[0]);
        for(int i=1;i<newArr.length;i++){
            System.out.printf(", %d",newArr[i]);
        }
        System.out.println("]");
        //System.out.println(Arrays.toString(newArr)); 알고리즘 학습용으로서는 부적절.
    }
}
