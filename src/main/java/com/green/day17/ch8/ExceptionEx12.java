package com.green.day17.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) /*throws Exception*/ {
        div(10,0);
        //divTry(10,2);
        //divThrows(10,2);
    }
    public static void div(int n1, int n2){
        //스태틱 여부는 상관 없다
        System.out.println(n1/n2);
    }public static void divTry(int n1, int n2) throws Exception {
        try {
            System.out.println(n1 / n2);
        } catch (Exception e) {
            System.out.println("0으로 나누면 안돼요.");
        }
    }
    public static void divThrows(int n1,int n2) throws Exception{
            System.out.println(n1/n2);//예외가 발생하면 던지겠다
    }
}

