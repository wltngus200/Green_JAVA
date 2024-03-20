package com.green.practice;

import java.util.Scanner;

public class NOT_YET_MissionReapeat04 {
    public static void main(String[] args){
        //4. 스캐너 사용해서 값을 입력받기
        //-배열을 활용해서 1개는 반 학생들의 이름 1개는 성적을 입력

        //배열에 문자열 넣을 수 있나??

    Scanner scan=new Scanner(System.in);
    System.out.print("학생 수를 입력하세요.");
    int stu=scan.nextInt();
    String name[]=new String[stu];
    int score[]=new int[stu];
    for(int i=0;i<name.length;i++){//for에 자꾸 세미콜론 찍지 말라고 ㅠㅠ
        for(i=0;i<name.length;i++){
            System.out.print((i+1)+"번 학생의 이름을 입력하세요.");
            name[i]=scan.nextLine();
        }
        for(int z=0;z<name.length;z++){
        System.out.print((z+1)+"번 점수를 입력하세요.");//새로운 함수! 아니면 학생수+1됨
        score[z]=scan.nextInt();//점수를 입력하는 함수를 안 넣었다
        }
    }System.out.println("성적 입력이 끝났습니다.");
    int sum=0;
    for(int i=0;i<name.length;i++){
        sum=sum+score[i];
    }
    System.out.printf("총 점은 %d입니다.\n",sum);//%d가 맞나?
    System.out.printf("반 평균 점수는 %d입니다.\n",sum/stu);
    for(int i=0;i<name.length;i++){
        System.out.print(name[i]+":");
        System.out.println(score[i]);//위는 엔터 없고 밑엔 있어야지
    }
    }
}
