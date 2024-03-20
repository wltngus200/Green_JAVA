package com.green.day3;

public class MissionForLoop {
    public static void main(String[] args){
        //for(int i=0;i<100;i++){
        //    System.out.println(i+1);
        //}


        int star=0;//3~10랜덤값이 대입
        //Math.random의 최소값은 0, 문제의 최소값을 +해줘야함
        star=(int)(Math.random()*8)+3;
        System.out.println(star);
        //"문자열" 곱하기 반복이 안 되는구나
        //System.out.println("*".repeat(star))
        for(int i=0;i<star;i++){
            System.out.print("*");
        }
        System.out.println("기본");


        //star개수만큼 출력
        System.out.println(star);
        for(int i=0;i>-star;i--){
            System.out.print("*");
        }
        System.out.println("마이너스");

        //선생님 답
        System.out.println(star);
        for(int i = star; i>0; i--){
            System.out.print("*");
        }
        System.out.println("선생님");
    }
}
