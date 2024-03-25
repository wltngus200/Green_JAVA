package com.green.day8.ch4;

public class FlowEx16_2 {
    public static void main(String[] args){
        int star=5;
        //Star 값이 5라면 별 5*5
        for(int i=1;i<=star;i++){//아래와 의미가 같음 1,2,3,4,5(star=5)
            for(int j=0;j<star;j++){//0,1,2,3,4(star=5)
                System.out.print("*");
            }System.out.println();
        }System.out.println();
    }
}
