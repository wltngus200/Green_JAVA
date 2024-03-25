package com.green.day8.ch4;

public class FlowEx13 {
    public static void main(String[] args){
    //1에서 10까지 전부 더한 값 출력 + 그 과정을 출력
    //ex. 1부터 1까지의 합: 1/1부터 2까지의 합: 3...

    int pick=0;//for문이 도는 동안 계속 유지될 값이 필요(=더 큰 스코프에 변수 생성)

    for(int i=1;i<=10;i++){
        pick=pick+i;//더한 값을 저장할 공간을 만들어야 됨(pick+=i)
        System.out.printf("1부터 %d까지 더한 값은 %d입니다.\n",i,pick);
    }System.out.println();
    }
}
