package com.green.TestScore;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //3자리 랜덤수, 1자리 수씩 추출, 볼, 스트라이크, 아웃
        //자리수+숫자 맞으면 스트라이크, 숫자만 맞으면 볼, 아무것도 안 맞으면 아웃
        //자리수 상관 없이 대조해 보는게 문제네?

        int num=(int)(Math.random()*899.0)+100;//100~999까지의 숫자
        System.out.printf("출력된 값은 %d.\n",num);//임시 정답 확인용

        String strnum=Integer.toString(num);//int(여기선 랜덤값 num)를 문자로
        char[] answer=strnum.toCharArray();//String 문자의 배열로!
        //System.out.println(Arrays.toString(answer)); //['a','b','c'] 처럼 나옴
        //3자리 숫자를 만들고 그것을 문자열로.

        System.out.print("숫자를 입력하세요.");
        String input=scan.nextLine();
        char[] result=input.toCharArray();
        //입력받은 숫자도 문자의 배열화
        //System.out.print(Arrays.toString(result)); //['a','b','c'] 처럼 나옴

        int strike=0;
        int out=0;
        int ball=0;

        for(int i=0;i<answer.length;i++){
            for(int j=0;j<result.length;j++){
                if(result[i]==answer[j] && i==j){
                    strike+=1;
                } else if(result[i]==answer[j] && i!=j) {
                    ball+=1;
                } else {
                    out+=1;
                    //아웃으로 다 빠져버리네
                }
            }
        }System.out.printf("%d Strike, %d ball, %d out",strike,ball,out);

        //for(int i=0;i<answer.length();i++){
//            char a=answer.charAt(0);
//            char b=answer.charAt(1);
//            char c=answer.charAt(2);
//        if(a)

        //System.out.printf("%d strike, %d ball, %d out");//결과 출력창

    }
}
