package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args){
    Star star=new Star();

    star.singlePrintint(3);//*****(개행)
    System.out.println("-----------");

    star.squarePrint(3);
    System.out.println("-----------");

    star.trianglePrintint(3);
    System.out.println("-----------");

    star.xtrianglePrintint(3);
    System.out.println("-----------");

    star.diamondPrintint(5);
    System.out.println("-----------");

    star.righttrianglePrint(5);
    System.out.println("-----------");

    }
}
class Star{
    void singlePrintint(int num){//메소드 요소 1. 파라미터 2. 리턴타입 3. 메소드명
        for(int i=0;i<num;i++){
            System.out.print("*");
        }System.out.println();
    }
    void squarePrint(int num){
        for(int i=0;i<num;i++){
            singlePrintint(num);//최대한 중복된 코드 줄이기!>>버그 가능성 줄이기 위해
        }
    }
    void trianglePrintint(int num){
        for(int i=1;i<=num;i++){
            singlePrintint(i);
        }
    }
    void xtrianglePrintint(int num){
        for(int i=num;i>0;i--){
            singlePrintint(i);
        }
    }
    void diamondPrintint(int num){
        trianglePrintint(num);
        xtrianglePrintint(num);
    }
    void righttrianglePrint(int num) {
        for (int s=0; s<num; s++) {
            for (int i=num; i>=s; i--) {
                System.out.print(" ");//여백이 4,3,2,1
            }
            for (int j = 0; j <=s; j++) {//삼각형
                    System.out.print("*");
            }System.out.println();
            //singlePrintint(num); 조건식이 <=라서 조금 다르게 나옴..
        }
    }
}