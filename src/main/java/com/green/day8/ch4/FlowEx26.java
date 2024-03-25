package com.green.day8.ch4;

public class FlowEx26 {
    public static void main(String[] args){
        //1부터 계속 숫자를 올리면서 더함 더한 값이 100미만인 index(그때의 마지막 숫자?)값이 몇인지 구하시오.
        /*int sum=0;
        int i;
        for (i = 1; i < 100; i++) {
            sum += i;
            if (sum > 100) {
                break;
            }
        }System.out.println(i-1);*/
    //출제 의도는 while
        int sum2=0;
        int i2=0;
        while(sum2<100){
            sum2+=++i2;
        }System.out.println(sum2);
        System.out.println(i2);
        System.out.println();
        //내 방법은 굳이 1을 더 돌리고 출력하게 됨

        int sum3=0;
        int i3=0;
        while((sum3+=++i3)<=100){
            System.out.printf("%d-%d%n",i3,sum3);
        }

        int i4=0;
        int sum4=0;
        while(sum4<=100){
            int result=sum4+i4+1;//i를 올리지 않고 +1을 함
            //result가 없으면 위의 나의 경우처럼 14까지 더해지고서야 반복끝
            //그래서 sum이 끝난 시점에서 ++i4가 더해지지 않은 sum이 나옴
            //즉 result가 한 단계 앞서나가 있는 것
            if(result>100){
                break;
            }
            sum4+=++i4;//sum4=sum4+(i4~계속 증가하는 값 누적)
        }System.out.println(sum4+"\n"+i4);
    }
}
