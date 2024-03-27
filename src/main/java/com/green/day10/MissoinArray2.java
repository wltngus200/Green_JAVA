package com.green.day10;

import java.util.Arrays;

public class MissoinArray2 {
    public static void main(String[] args){
        //정수값 10칸짜리 배열. 10칸 초기화 하는데 10~30 랜덤값이 세팅
        int[] Arr=new int[10];
        for(int i=0;i<Arr.length;i++){
            int a=(int)(Math.random()*21)+10;
            //랜덤값이 반복문 안에 있지 않으면 같은 값이 들어감
            Arr[i]=a;
        }
        for(int j=0;j<Arr.length;j++){
            System.out.print("["+Arr[j]+"]");
            System.out.println(Arrays.toString(Arr));
        }
    }
}
