package com.green.day18;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args){
        Exam2.printGugudan(2,5);//2x1=2 (\t) 3x1=3 .....개행

        int sum=Exam2.getSumFromString("23223");
        int sum2=Exam2.getSumFromString("111");
        System.out.println(sum);
        System.out.println(sum2);

        System.out.println("---------------");
        int[] arr=new int[3];
        System.out.println(Arrays.toString(arr));
        Exam2.inputRandomValues(arr);
    }
}
class Exam2{
    static void printGugudan(int min, int max){
        for(int i=1;i<10;i++){
            for(int j=min;j<=max;j++){
                System.out.printf("%d X %d = %d\t",j,i,j*i);
            }System.out.println();
        }
    }

    static int getSumFromString(String val){
        int val1=Integer.valueOf(val);
        int val1_copy=val1;
        int sum=0;
        for(int i=0;i<val.length();i++){
            sum+=val1_copy%10;
            val1_copy=val1_copy/10;//val1_copy/=10
        }return sum;
        //Character.getNumericValue(char mmm);
    }
    static void inputRandomValues(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int num = (int)(Math.random() * 9)+1;
            arr[i]=num;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {//칸이 아니라 뽑은 숫자와 배열 전체를 대조
                    i--;
                    break;
                }
            }
        }System.out.printf("결과: %s",Arrays.toString(arr));
    }//1~9까지 배열을 만들고 셔플 후, 3칸만 가져옴
}
