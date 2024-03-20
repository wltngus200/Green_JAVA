package com.green.practice;

public class NOT_YET_MissionRepeat03 {
    public static void main(String[] args){
        //3. 반복으로 별찍기(사각형 삼각형 다이아몬드)

        //1)5*5의 정사각형으로 별 찍기
        //두가지 모두 5까지 범위를 지정하면 된다
        for(int s=0;s<5;s++){
            for(int t=0;t<5;t++){
                System.out.print("*");
            }System.out.println();
            //개행을 해줘서 *****가 반복될 수 있게
        }
        System.out.println("5*5의 정사각형");

        //2)3(가로)*7(세로)의 직사각형으로 별 찍기
        for(int a=0;a<7;a++){
            for(int r=0;r<3;r++){
            //안쪽 부분이 가로이기 때문에 3으로 설정
            System.out.print("*");
            //3개를 찍게 하고 개행
            }System.out.println();
        }System.out.println("가로3*세로7의 직사각형 1");
        System.out.println();

        for(int i=0;i<7;i++){
            System.out.println("***");
        }//반복문 1개로 끝낼 수 있는 좋은 방법(정사각형에도 적용됨)
        System.out.println("가로3*세로7의 직사각형 2");
        System.out.println();

        //★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
        //3)마지막 줄 별이 6개인 6줄짜리 삼각형
        //우선 줄 개수는 6개여야 되니까
        for(int m=0;m<6;m++){
            //1번줄 1개, 2번줄 2개 찍으며 반복 필요
            for(int n=1;n<=7;n++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
