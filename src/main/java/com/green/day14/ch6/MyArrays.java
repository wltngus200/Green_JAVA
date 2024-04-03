package com.green.day14.ch6;

import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;

public class MyArrays {
    public static void printArr(int[] numArr) {
        System.out.print("[");

        if (numArr.length != 0) {
            System.out.print(numArr[0]);
            for (int i = 1; i < numArr.length; i++) {
                System.out.print(", " + numArr[i]);
            }System.out.println("]");
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

        public static String toString(int[] arr){
            if(arr.length==0) return "[ ]";
            String str=String.format("[%d",arr[0]);
            for(int i=1;i<arr.length;i++){
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
        MyArrays.printArr(arr);//객체 생성 X 클래스명.메소드명=static//만든 메소드
        //바로 콘솔에 찍는 용도 반복을 거듭하며 하나씩 찍어냄

        String str= Arrays.toString(arr);
        System.out.println("str: "+str);
        //문자열을 만드는 용도 문자열을 만든 뒤에 한번에 찍음

        String str2=MyArrays.toString(arr);
        System.out.println("str2: "+str2);

        String str3=MyArrays.toString(arr);
        System.out.printf("str2==str3: %b\n",str3==str2);//동일하냐 false
        System.out.println("str2.equals(str3): "+str2.equals(str3));//동등하냐 true//문자열 비교 equals 같은 문자를 들고있느냐


    }

}