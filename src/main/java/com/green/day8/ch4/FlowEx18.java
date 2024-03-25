package com.green.day8.ch4;

public class FlowEx18 {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }if(i==9) {//마지막단 이후에 줄 안 나오게하기
                //현재는 문제가 없으나 단의 수가 바뀔 경우 문제 발생
                //단 찍고 선이 아니고 선 찍고 단이면 하기 수월
                break;
            }else{
                System.out.println("-----");
            }
        }//이중 포문=시계 //빠르게 도는 게 분=안 쪽 for문
    }
}
