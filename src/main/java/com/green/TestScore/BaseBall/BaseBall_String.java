package com.green.TestScore.BaseBall;

import java.util.Scanner;

public class BaseBall_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String question="123";//문제

        //String usernum=scan.nextLine();//사용자가 입력하게
        String usernum="359";
        int idx=usernum.indexOf(usernum.charAt(0)); //1자리수를 뽑아내고 인덱스값
        System.out.println(idx);

        for(int i=0; i<question.length();i++){
            usernum.indexOf(usernum.charAt(i));
        }
    }
}
