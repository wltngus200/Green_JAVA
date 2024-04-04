package com.green.TestScore.BaseBall;

import java.util.Scanner;

public class BaseBall_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String question="123";//문제

        //String usernum=scan.nextLine();//사용자가 입력하게
        //다른 발상 일치하면 아예 빼버려? 스트라이크 나오면 해당 숫자 _처리(당연히 둘 중 한 쪽만)
        String usernum="359";
        int idx=usernum.indexOf(usernum.charAt(0)); //1자리수를 뽑아내고 인덱스값
        System.out.println(idx);

        for(int i=0; i<question.length();i++){
            usernum.indexOf(usernum.charAt(i));
        }
    }
}
