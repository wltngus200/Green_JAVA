package com.green.day14.ch6;

import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;

public class MyArrays {
    static void printArr(int[] numArr) {
        System.out.print("[");

        if (numArr.length != 0) {
            System.out.print(numArr[0]);
            for (int i = 1; i < numArr.length; i++) {
                System.out.print(", " + numArr[i]);
            }System.out.println();
        }
    }
        /*
        if(numArr.length==0){
            System.out.println("[]")
            return;
        }System.out.printf("[%d",numArr[0]);
        for(int i=0;i<arr.length;i++){
            System.out.printf(", %d",numArr[i]);
        }System.out.println();
         */

        static String toString(int[] arr){
            if(arr.length==0) return "[ ]";
            String str=String.format("[%d",arr[0]);
            for(int i=0;i<arr.length;i++){
                str+=String.format(", %d",arr[i]);//a+=b -> a=a+b
            }
            str+="]";
            //스트링빌더(반복문 제외) 문자열 합치기가 성능이 떨어짐
            return str;
        }
}
class MyArraysTest{
    public static void main(String[] args){
        int[] arr={3,2,1,6,5,4,10};
        MyArrays.printArr(arr);//객체 생성 X 클래스명.메소드명=static

        String str= Arrays.toString(arr);
        System.out.println("str: "+str);

        String str2=MyArrays.toString(arr);
        System.out.println("str2: "+str2);

    }

}