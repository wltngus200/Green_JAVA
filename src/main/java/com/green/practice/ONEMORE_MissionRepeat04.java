package com.green.practice;

import java.util.Scanner;

public class ONEMORE_MissionRepeat04 {
    public static void main(String[] args){
        //4. 스캐너 사용해서 값을 입력받기
        //-배열을 활용해서 1개는 반 학생들의 이름 1개는 성적을 입력
        //배열에 문자열 넣을 수 있나??
        //이름 배열과 성적 배열을 만들어서 두개의 같은 첨자를 출력하면 해당 학생 성적 나옴

    Scanner scan=new Scanner(System.in);

    System.out.print("학생 수를 입력하세요.");
    int stu=scan.nextInt();//받은 값이 학생의 수
    String[] name=new String[stu];//학생 수만큼의 이름 배열=출석부
    int[] score=new int[stu];//학생 수 만큼의 점수
    //뭐지 뭐가 문제지??

    for(int u=0;u<stu;u++){//학생 이름 입력
        System.out.print((u+1)+"번 학생의 이름을 입력하세요.");
        name[u]=scan.next();//1,2 번 학생이 같이 나오는 이유가 뭐지
        //nextLine에서 오류가 난 것으로 추정
    }
    System.out.println();

    for(int z=0;z<stu;z++){//각 학생별 점수 입력
        System.out.print((z+1)+"번 점수를 입력하세요.");//새로운 변수! 아니면 학생수+1됨
        score[z]=scan.nextInt();//점수를 입력하는 함수를 안 넣었다
    }System.out.println();

    System.out.println("성적 입력이 끝났습니다.");

    int sum=0;
    for(int i=0;i<name.length;i++){
        sum=sum+score[i];
    }
    System.out.printf("총점은 %d입니다.\n",sum);//%d가 맞나?>>정수값
    System.out.printf("반 평균 점수는 %d입니다.\n",sum/stu);
    for(int i=0;i<name.length;i++){
        System.out.print(name[i]+":");
        System.out.println(score[i]);//위는 엔터 없고 밑엔 있어야지
    }
    //실수리스트
        // 점수 입력받는 메서드 안 넣기
        // 2번째 변수 재설정 안 해서 학급 인원수(input값)+1하기
    }
}
