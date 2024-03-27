package com.green.practice;

public class NOT_YET_MissionRepeat03 {
    public static void main(String[] args){
        //★★★반복을 거듭할 때마다 바뀌는 수치는 변수를 활용★★★
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

        //3)우측 정렬한 직각 삼각형
        for(int m=1;m<=4;m++){//우선 줄 개수는 4개여야 되니까
            //1번줄 1개, 2번줄 3개 찍으며 반복 필요
            for(int x=3;x>=m;x--) {//여백의 개수 3 2 1
                System.out.print(" ");
            }
            for(int n=0;n<m;n++){
                System.out.print("*");
            }System.out.println();
        }System.out.println("우측 정렬한 직각삼각형");
        System.out.println();//의도한 건 아닌데 ㅋㅋ

        //4)가운데로 맞춰진 마지막 줄 별이 7개인 4줄짜리 삼각형 1-3-5-7
        for(int a=0;a<7;a+=2){//줄의 개수 2씩 증가시켜 0246 4줄
            for(int b=3;b>=a;b--){//3210으로 줄어들어야 함
                System.out.print(" ");
            }
            for(int c=0;c<7;c++){
                System.out.print("*");
            }
        }System.out.println();

        //4)역삼각형 별찍기
        //5)다이아몬드 만들기
        //6)%d를 이용해 가능하다면 트리 만들기
    }
}
