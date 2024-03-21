package com.green.practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("몇월입니까");
        int month=scan.nextInt();

        String result="";
        switch(month) {
            default://무조건 마지막에 있어야 되는 건 아님
                result="잘못된 값입니다.";
                break;
            case 11:
            case 12:
            case 1:
                result="winter";
                break;
            case 2:
            case 3:
            case 4:
                result="spring";
                break;
            case 5:
            case 6:
            case 7:
                result="summer";
                break;
            case 8:
            case 9:
            case 10:
                result="fall";
                break;
        }System.out.println(result+month+"월입니다.");

    }
}
