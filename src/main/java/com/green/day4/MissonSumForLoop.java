package com.green.day4;

public class MissonSumForLoop {
    public static void main(String[] args){
        //1~10까지 더한 값 출력
        int sum=0;
        for(int i=1;i<=10;i++){//첨엔 0~10으로 했는데 1이 맞네 굳이 0부터 돌릴 이유X
            //sum+=i; 복합식 가능하넹 안 알려주셔서 안 쓰셨던 듯
            sum=sum+i;
            //i대신 sum을 쓰면 이상한 값 나와 => 디버깅 해서 체크
            //for문을 돌면 계속 새거가 되기 때문
        }
        System.out.print(sum);
        //

    }
}
