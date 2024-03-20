package com.green.day4;

import java.util.Scanner;

public class onemoretimeD3_MissionIf3_and_or {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("성별을 입력해주세요(남/여)");
        String gender=scan.nextLine();
        System.out.print("당신의 키를 입력해주세요");
        int height=scan.nextInt();

        /*int standHeight=175;
        System.out.print("당신은");
        if("남".equals(gender)||"여".equals(gender)){
            if("남".equals(gender)){
                System.out.print("남자 ");
            } else {
                standHeight=161;
                System.out.print("여자 ");
            }

            if(height > standHeight) {
                System.out.println("평균보다 큽니다.");
                //당신은~~니다. 같은 중복된 코드를 줄일 필요가 있다.
            } else if(height<standHeight){
                System.out.println("평균보다 작습니다.");
            } else {
                System.out.println("평균입니다.");
            }
        System.out.println("-종료-");*/

        int standheight=161;
        if("남".equals(gender)){
            standheight=175;
            System.out.print("남자 평균");
        } else if ("여".equals(gender)){
            System.out.print("여자 평균");
        }
        if (height > standheight) {
            System.out.print("보다 큽니다.");
        } else if (height < standheight) {
            System.out.print("보다 작습니다.");
        } else {
            System.out.print("입니다.");
        }
        //do while 대신 배운 while if 를 사용해서 키 평균과 비교
    }
}
