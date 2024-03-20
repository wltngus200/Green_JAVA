package com.green.day3;

public class MissionMultipleForLoop {
    public static void main(String[] args){
            int star=(int)(Math.random()*5.0)+2;//2~6 랜덤값
    //star값에 따라 n*n의 별값 출력(정사각형)
        for(int i=0;i<star;i++){
            for(int k=0;k<star;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(star);
    }
}
