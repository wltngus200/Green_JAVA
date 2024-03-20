package com.green.day4;

public class LogicalOperator {
    public static void main(String[] args){
        if(true&&true){
            System.out.println("true");
        }
        boolean r1=true&&true&&true;
        System.out.println("r1:"+r1);

        boolean r2=true&&true&&false;
        System.out.println("r2:"+r2);
        System.out.println();

        //&&는 모두 옳아야함 ||하나만 참이 있으면 됨
        //&&는 true가 ||는 거짓이 나오기 어려움

        System.out.println();
        boolean k1=true||true||false;
        System.out.println("k1:"+k1);

        boolean k2=false||true||false;
        System.out.println("k2:"+k2);

        boolean k3=false||false||false;
        System.out.println("k3:"+k3);
        System.out.println();


    }
}
