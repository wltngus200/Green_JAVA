package com.green.day6.ch4;

public class FlowEx1 {
    public static void main(String[] args){
        int x=3;
        //x=0일 때, 참인 것은?(개행)
        System.out.printf("x=%d일 때, 참인 것은?\n",x);
        //0x10 -> 16진수

        String name="슬랙";
        char bloodType='B';
        int age=15;
        boolean gender=true;//true, false
        System.out.printf("%s의 혈액형은 %c이고, 나이는 %d살입니다. %s입니다.\n",name, bloodType,age,(gender?"남자":"여자"));
        //%b는 t/f만 출력됨 %s해야 삼항식으로 내가 원하는 값을 출력

    }
}
