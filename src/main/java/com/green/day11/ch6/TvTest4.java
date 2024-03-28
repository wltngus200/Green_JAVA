package com.green.day11.ch6;

import java.util.Arrays;

public class TvTest4 {
    public static void main(String[] args){
        //1. Tv 주소값을 3개 저장할 수 있는 배열
        Tv[] tvArr=new Tv[3];

        System.out.println(Arrays.toString(tvArr));//디폴트값 null이당

        //2. 각 방에 tv객체의 주소값을 넣어준다 모두 동일하지 않다
        Tv tv_=new Tv();//주소값을 넣는 것
        for(int i=0;i<tvArr.length;i++){
            tvArr[i]=new Tv();
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
            //포이치로는 배열을 수정할땐 안 씀. 배열이 가진 값을 바꿀때
            //  -A티비를 C티비로 C티비를 B티비로 같은 경우
            //배열이 가진 객체의 값을 수정
        }
    }
}
