package com.green.day9.ch5;

public class MissionArray1 {
    public static void main(String[] args){
        //1번 문제
        int[] numArr={10,20,30,40};//내가 넣은 수만큼 방+초기화까지 완료
        //for문 활용 10,20,30,40나오게
        for(int i=0;i<numArr.length;i++){
            System.out.printf("%d, ",numArr[i]);
        }
    }
}
