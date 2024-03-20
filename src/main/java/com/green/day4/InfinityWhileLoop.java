package com.green.day4;

import java.util.Scanner;

public class InfinityWhileLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int input=0;

        while(true){//
            System.out.print("숫자를 입력해주세요.(종료:0)");
            input=scan.nextInt();//input에 0이 있을때만 브레이크를 만나게
            if (input == 0) { break;}//선생님 추천! 문장이 하나일땐 중괄호 생략가능
            }
            System.out.println("종료");
        //
    }

}
