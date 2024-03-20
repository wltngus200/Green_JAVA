package com.green.day4;

public class ContinueBreak {
    public static void main(String[] args){
        //반복문에서 사용, 컨티뉴는 스킵, 브레이크(박살)는 스탑
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
        System.out.println("-----break");
        for(int i=0;i<10;i++) {
            if (i == 5) {break;}//5가 되는 순간 탈출
            System.out.println(i);
        }

        System.out.println("-----continue");
        for(int i=0;i<10;i++) {
            if (i == 5) {
                continue;//컨티뉴가 제일 끝에 있으면 의미 없음
            }//5가 되는 순간 다음으로
            System.out.println(i);
        }
    }
}
