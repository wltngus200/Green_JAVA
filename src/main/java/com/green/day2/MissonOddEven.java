package com.green.day2;

public class MissonOddEven {
    public static void main(String[] args){
        int num=(int)(Math.random()*10)+1;//1~10
            System.out.print(num);
            System.out.print('는');
        if(num%2==0){
            System.out.print("짝");
                    //(num+"은 짝수입니다.");
        } else {
            System.out.print("홀");
                    //(num+"은 홀수입니다.");
        }
            System.out.print("입니다.");
    }
}
