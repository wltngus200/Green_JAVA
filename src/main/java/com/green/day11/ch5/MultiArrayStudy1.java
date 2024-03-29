package com.green.day11.ch5;

public class MultiArrayStudy1 {
    public static void main(String[] args){
        //p.214
        int[][] score =new int [3][5];//줄(가로)칸(세로)//이거 표현하기 나름인가?
        //가방 안에 든 모든 물건=객체 지갑 안 지폐 이런 것도 객체
        //1차 자식 3명, 2차 자식 5명
        score[0][0]=5;
        score[1][1]=10;
        score[1][3]=50;

        System.out.println(score.length);
        //score[0] 또한 배열
        int[] temp=score[0];//이런 것도 가능
        int[][] temp2=score;
        //int[] temp3=score; X
        System.out.println(score[0].length);

        for(int i=0;i<score.length; i++){//줄 담당
            for(int z=0;z<score[0].length;z++){//칸 담당
                System.out.printf("%d\t",score[i][z]);//\t=탭!
            }System.out.println();
        //페이징 처리 게시판의 페이지 1 2 3 4......=모든 게시글을 가져오면 렉
            //인스타피드의 구조 사진, 좋아요, 댓글, 좋아요수 등등 기능 이걸 담는 피드 그걸 담는 더 큰 개념
            //인스타= 인피니티 스크롤
        }
    }
}
