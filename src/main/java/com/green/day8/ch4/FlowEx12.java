package com.green.day8.ch4;

public class FlowEx12 {
    public static void main(String[] args){
        //반복문을 사용하여 1~5를 가로 세로로 출력한다

        System.out.println("[Horizontal]");
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("[Vertical]");
        for(int j=1;j<=5;j++){
            System.out.println(j);
        }
    }
}
