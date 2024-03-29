package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args){
        //다중 배열 더해서 평균내기 연습문제

        int[][] score={
                {100,90,80}
                ,{20,25,35}
                ,{30,30,30}
                ,{40,40,40}
        };
        /*score입장에선 방이 몇개가 있냐
        score[0] 0번방의 배열의 주소값 =1차원 배열
        int[] arr0=score[0]={100,90,80}
         */

        /*
        0 100 20 30 40 //이 라인의 합계와 총점
        1 90 25 30 40
        2 80 35 30 40
        //score[3][3]

        //3이 자주 돌아야 하는 라인=차례로 더해야 하니까, 4는 바깥
        //첫번째 자식=score.length=4개
        //두번째 자식=3개{100,90,80}
         */
        System.out.println(score.length);//4
        System.out.println(score[0].length);//3

        for(int i=0; i<score[0].length;i++){//안
            int sum2=0;
            for(int j=0;j<score.length;j++){//바깥
                sum2+=score[j][i];
            }System.out.printf("%d열의 총점은 %d이고, 평균값은 %.2f입니다\n",i,sum2,(double)sum2/score.length);
        }System.out.println();

        //가변배열 배열 내의 배열들의 길이가 다른 배열
        //score[0]을 하면 혹시 해당 길이보다 긴 배열이 안에 있을 시 제대로 돌지 않을 수도 있음
        //위의 경우엔 해당 X
        /*
        0 100 20  30  40
        1 90  25  30  40
        2 80  35  30  40
                  30
         */

        //배열 1개 추가(sum값)
        //선생님 풀이는 나랑 다른 방식이네 4칸짜리 배열을 만들고
        //배열을 한번씩 훑어서 같은 칸에 해당하는 값들을 다 더함

    }
}
