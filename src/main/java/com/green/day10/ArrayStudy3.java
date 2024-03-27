package com.green.day10;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args){
        //oop전에 예방주사 겸 얕은 복사와 깊은 복사??

        int[] nArr1={10,20,30};//배열을 담을 주소값 하나만 저장!
        int[] nArr2=nArr1;//주소값이 복사가 됨 그 순간 둘은 같은 값을 가지게 됨
        //nArr1도 nArr2 제어가능//shallow copy 얕은 복사

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        nArr2[1]=50;
        System.out.println(nArr2[1]);//50
        System.out.println(nArr1[1]);//역시 50..

    }
}
