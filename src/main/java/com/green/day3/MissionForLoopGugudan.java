package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args){
        int dan=(int)(Math.random()*8)+2;
        System.out.println(dan+"단을 외자~");//2~9가 나오게 됨

        //위에서 해당되는 구구단 표가 나오게
        for(int i=1;i<10;i++){
            System.out.println(dan+"x"+i+"="+(dan*i));
        }

    }
}
