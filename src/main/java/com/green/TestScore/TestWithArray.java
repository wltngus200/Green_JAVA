package com.green.TestScore;

import java.util.Scanner;

public class TestWithArray {
    public static void main(String[] args) {
        //배열 안에 배열을 넣기
        Scanner scan=new Scanner(System.in);

        /*
        System.out.print("학생 수를 입력하세요.");//학생 수를 설정
        int num=scan.nextInt();
        System.out.print("과목 수를 입력하세요.");//과목 수를 결정
        int subject=scan.nextInt();

        String[] student=new String[num];
        int score[]=new int[];
        for(int i=0;i<num;i++){
            System.out.printf("%d번 학생의 이름을 입력해주세요.",(i+1));
            String name=scan.next(); //Scanner 탓인가 for문에서 nextLine은 에러
            student[i]=name;
            for(int j=0;j<subject;j++){
                  =new int[subject];//이부분 에러
                System.out.printf("%s 학생: %d번 과목의 점수를 입력해주세요.",student[i],(j+1));
                //과목명도 넣으면 좋겠는데 아직까진..
                score[j]=scan.nextInt();
            }
        }System.out.print(student);//안 되네 방법을 모르는 건가
        System.out.print(score);
        */


        //실수 목록
        //String을 요소로 하는 배열!
        //printf 사용 미숙
        //j<subject로 학생이름 이름 반복>>j<i로 수정 ㅋㅋ>>같거나 작다로 바꿈
        //했는데 왜 학생이름 2번 넣지 ㅋㅋㅋㅋ
        //for문을 반전시키자//점수 안 학생>>학생 안 점수

        //다차원 배열!
        System.out.print("학생 수를 입력하세요. >");
        int people=scan.nextInt();
        System.out.print("과목 수를 입력하세요. >");
        int subject=scan.nextInt();

        int u=0;
        String[] student=new String[people];
        int[] score=new int[subject];
        for(u=0;u<student.length;u++);{//배열의 길이는 바깥쪽 기준
            System.out.printf("%d번 학생의 이름을 입력하세요.",(u+1));//왜 학생수+1이지
            String name=scan.next();//nextLine오류 유발?
            System.out.printf("%d 학생의 성적입니다.\n",name);
            for(int j=0;j<subject;j++){
                System.out.print("성적을 입력하세요.");
                int jum=scan.nextInt();
                score[j]=jum;
            }
        String[][] finish=new String[people][subject];
        System.out.println(score);
        System.out.println(student);
        for(int s=0;s<people;s++){

        }
        }System.out.println("성적 입력이 끝났습니다.");
    }
}
