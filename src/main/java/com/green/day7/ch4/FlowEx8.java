package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args){
        //Scanner 객체를 통해 주민번호 입력 받기
        //주민번호를 확인하여 성별을 확인+유효성 검사
        //switch 사용

        Scanner scan=new Scanner(System.in);
        System.out.print("주민등록 번호를 입력하세요.(123456-7891234)>>");
        String adress=scan.nextLine();

        char num=adress.charAt(7);//문자열에서 원하는 자리 추출
        //0에서 시작?

        String gender=switch(num){
            case '1','3' -> "남자";
            //case 1,3하면 정수형 //정수값으로 비교해 위의 문자가 정수로 바뀜
            case '2','4' -> "여자";
            default -> "유효한 값을 입력하세요";
        }; System.out.print(gender);
        //월 부분에 13이상 나올 수 없음. 일 부분 31일이상 쓸 수 없음
        //정규표현식?? 을 써서 확인
    }
}
