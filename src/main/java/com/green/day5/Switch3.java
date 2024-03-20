package com.green.day5;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("성별(남/여)");
        String gender = scan.nextLine();

        //null; 의미=주소값을 안 가지고 있다(객체를 가리키지 않음)
        //레퍼런스(대문자)변수에만 설정가능(int 불가)
        String result=switch (gender){
            case "여","여자","woman"->"당신은 여성입니다.";
            case "남","남자","man"-> "당신은 남성입니다.";
            default -> "올바른 성별을 입력해주세요.";
            };
            System.out.println(result);
        }
}
