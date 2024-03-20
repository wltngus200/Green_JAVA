package com.green.practice;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] ban=new int[5];
        for(int i=0;i<5;i++){
            System.out.print((i+1)+"번의 성적을 입력하세요.");
            ban[i]=input.nextInt();
        }
        int sum=0;
        int people=0;
        for(int j=0;j<5;j++){
            sum+=ban[j];
            people++;
        }

        System.out.println("점수의 총 합은 "+sum+"점입니다.");
        System.out.println("점수의 평균은 "+(double)(sum/people)+"점입니다.");
        System.out.println("학급의 인원:"+ban.length);
        //위에서 j나 i를 재사용할 수 없어서 설정했음
        //아마도 for 내에서 설정된 함수이기 때문일 듯.>>맞았다
        //(수정)새로 사람 수를 변수로 갖는 애를 설정 할 것 없이 length사용

    }
}
