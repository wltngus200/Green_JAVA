package com.green.day4;

public class MissionSumEvenForLoop {
    public static void main(String[] args) {
        //1~100까지 짝수만 더한 값 출력
        int sum=0;
        for(int i=1;i<=345;i++){//조건을 따지지 않고 홀수까지 카운트=비효율
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
        System.out.println(" <-if를 사용했을 때");

        int sum2=0;
        for(int s=2;s<=345;s+=2){
            //증감식 : i++이 결국 i=i+1/
            // >>'s+=2' 나 's=s+2'로 넣으세요
                sum2=sum2+s;
        }
        System.out.print(sum2);
        System.out.print(" <-for의 증감식을 수정했을 때");
//


    }
}
