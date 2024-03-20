package com.green.day5;

public class Switch {
    public static void main(String[] args){
        int month=(int)(Math.random()*12)+1;
        //랜덤은 절대 1이 안 나와서 내가 내고 싶은 값-1???
        //수학을 못하겠는데

        switch(month) {
            default://무조건 마지막에 있어야 되는 건 아님
                System.out.println("잘못된 값입니다.");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println("winter");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("spring");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("summer");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("fall");
                break;
        }System.out.println(month+"월입니다.");

        //case는 문자열일때 메리트 .equals()사용 안 해도 됨

    }
}
