package com.green.day4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        /*
        int i=0;//초기화
        while (i < 10) {//조건식
            System.out.println(i);
            i++;//증감식
        } for는 정해진 회수가 있는 동안, while은 조건은 알고 회수는 모를때
        System.out.println("종료");
        */

        Scanner scan=new Scanner(System.in);

        int input=1;//while은 바로 물어봐서 미리 초기화

        while(input!=0){//괄호 안이 true인 동안(=input이 0이 아닌 동안)안을 계속 시행하라
            System.out.print("숫자를 입력해주세요.(종료:0)");
            input=scan.nextInt();
        }//단점: 입력을 전부 더하고 싶다. 근데 인풋 초기화가 1이라서 1이 무조건 포함
        //1번정도는 그냥 넘어가줬으면한다 =do while
        //
        System.out.println("종료");
    }
}
