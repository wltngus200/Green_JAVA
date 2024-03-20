package com.green.day5;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("성별(남/여)");
        String gender = scan.nextLine();

        String result=null; //의미=주소값을 안 가지고 있다(객체를 가리키지 않음)
        //레퍼런스(대문자)변수에만 설정가능(int 불가)
        switch (gender){
            case "여":
            case "여자":
            case "woman":
                result="당신은 여성입니다.";
                break;
            case "남":
            case "남자":
            case "man":
                result="당신은 남성입니다.";
                break;
            }
            System.out.println(result);
        }
}
