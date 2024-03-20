package com.green.day3;

import java.util.Scanner;

public class MissionIf1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("성별을 입력해주세요(남/여)");
        String gender=scan.nextLine();//숫자를 적어도 문자열
        if(gender.equals("남")){//"남".equals(gender)가 유리(에러 가능성 떨어짐)
            System.out.println("당신은 남자입니다.");
        } else if(gender.equals("여")){
            System.out.println("당신은 여자입니다.");
        } else {
            System.out.println("성별을 입력해주세요.");
        }
        System.out.println("-끝-");
    }
}
