package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args){
        //1~n까지 더하는데 100이 막 넘은 intdex값과 sum값
            //answer: i:14 / sum:105
        //While문으로 해결
        int i=0;
        int sum=0;
        while(sum<100){//계속 더하다가 sum이 100이 넘은 값이 들어오면 아래 시행 X
            i++;//첫 i값은 1
            sum+=i;
            //sum+=++i
        }System.out.printf("sum=%d, index=%d",sum,i);
    }
}
