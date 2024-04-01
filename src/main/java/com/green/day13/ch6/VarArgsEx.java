package com.green.day13.ch6;

public class VarArgsEx {//가변인자
    public static void main(String[] args){
        MyMath3_1 mm = new MyMath3_1();
        //내가 몇 개를 입력하더라도 다 더해주는 메소드를 만들고 싶다
        int[] arr={1,2,3};
        mm.sum(arr);
        mm.sum(new int[]{1,2,3});
        //mm.sum(int[] arr=new int[] {1,2,3})
    }
}
class MyMath3_1{
    void sum(int n1, int n2){
        System.out.println(n1+n2);
    }
    void sum(int...arr){//=(int[] arr)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum: "+sum);
    }
}