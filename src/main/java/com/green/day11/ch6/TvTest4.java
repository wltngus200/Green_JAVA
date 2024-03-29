package com.green.day11.ch6;

import java.util.Arrays;

public class TvTest4 {
    public static void main(String[] args){
        //1. Tv 주소값을 3개 저장할 수 있는 배열
        Tv[] tvArr=new Tv[3];//tv 객체의 주소값만 넣을 수 있는 배열
        //tvArr 주소값은 1개(0번방의 주소값이 저장되어 있음)변수는 무조건 1개의 값을 저장 못 함

        System.out.println(Arrays.toString(tvArr));//디폴트값 null이당

        //2. 각 방에 tv객체의 주소값을 넣어준다 모두 동일하지 않다
        Tv tv_=new Tv();//주소값을 넣는 것
        for(int i=0;i<tvArr.length;i++){
            tvArr[i]=new Tv();
            //tvArr[i]=방
        }System.out.println(Arrays.toString(tvArr));
        //방법 2
        for(int j=0;j<tvArr.length;j++){
            tvArr[j]=new Tv();
        }

        System.out.println("--------------");

        //3. 0번방 tv는 채널 11 1번방 12 2번방 13
        for(int t=0;t<tvArr.length;t++){
            tvArr[t].channel=11+t;
        };
        //각 배열의 채널을 반복으로 출력
        for(int v=0;v<tvArr.length;v++){
            System.out.print(tvArr[v].channel+" ");
        }
        //방법 2
        int channel=11;
        for(Tv tv:tvArr){
            tv.channel=channel++;
        }
        for(Tv tv: tvArr){
            System.out.println(tv.channel);
            //포 이치(for each)로는 배열을 수정할땐 안 씀. 배열이 가진 값을 바꿀때
            //  -A티비를 C티비로 C티비를 B티비로 같은 경우
            //배열이 가진 객체의 값을 수정

            //패키지=사람으로 따지면 성 주소값=이름
            //Tv라는 클래스 나만 만드는 거x 패키지명까지 적는것=풀네임
            //패키지명이 겹치지 않게하려고 도메인을 구매.
            //@다음에 나오는 것=해시코드
            //가비지 컬렉터가 있는 언어는 실행하면 전원을 내린다? 없는 언어와 속도 차이
        }
    }
}
