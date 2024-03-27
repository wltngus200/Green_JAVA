package com.green.TestScore;

import java.util.Scanner;

public class IdCorrect {
    public static void main(String[] args){

        //주민번호를 체크하자
        //오늘 배운 함수를 통해서
        //2자리를 추출하는 것이 필요하다면 구글링도

        Scanner scan=new Scanner(System.in);

        System.out.print("주민번호를 입력해주세요(######-#######)");
        String id=scan.nextLine();
        if(id.charAt(7)!='1'||id.charAt(7)!='2'||id.charAt(7)!='3'||id.charAt(7)!='4'){
            System.out.println("올바른 수치를 입력하세요");
        }
        System.out.print(id.charAt(2)+id.charAt(3));//z코드를 더해버리넹
    }


}
