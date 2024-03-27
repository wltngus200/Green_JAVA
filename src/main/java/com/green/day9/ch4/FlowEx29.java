package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args){
        //1~100까지 369게임 3=짝 36=짝짝 43=짝

        int i=1;
        for(i=1;i<=100;i++){
            System.out.print("i="+i+" ");
            int ten=i/10;
            int one=i%10;
            if(ten==3||ten==6||ten==9){
                System.out.print("짝!");
            }
            if(one==3||one==6||one==9){
                System.out.print("짝!");
            }System.out.println();
        }//100으로 제한 되어 있으니 그렇지 수치 바뀌면 해당 안 됨, 131이런거면 에러....


        //3의 배수를 거르면 안 됨 33 30의 짝의 개수가 다름
        for(int z=1;z<=100;z++){
            System.out.printf("i=%d ",i);
            int copy=i;

            while(copy>2){
                int one=copy%10;
                if(one%10==0&&one!=0){//10,20,30 거름
                    System.out.print(" 짝");
                }
                copy/=10;

            }
        }
    }
}
