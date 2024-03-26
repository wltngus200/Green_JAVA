package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args){
        //1~100까지 369게임 3=짝 36=짝짝 43=짝

        int i=1;
        for(i=1;i<=100;i++){
            System.out.print("i="+i+" ");
            int ten=i/10;
            int one=i%10;
            if(ten==3||ten==6||ten==9){
                System.out.print("짝!");
            }
            if(one==3||one==6||one==9){
                System.out.print("짝!");
            }System.out.println();
        }//100으로 제한 되어 있으니 그렇지 수치 바뀌면 해당 안 됨, 131이런거면 에러....


        //3의 배수를 거르면 안 됨 33 30의 짝의 개수가 다름
        for(int z=1;z<=100;z++){
            int copyi=i;
            int namuji;
            while(true){
                copyi/=copyi/10;
                //(copyi%3==0?"짝":"");//1의자리가 3으로 나누어 떨어지는지
                copyi=copyi/10;
                namuji=i%10;
                if(copyi>10){
                    //  ((copyi%10)%3==0?"짝":"")//1의 자리가 3으로 나누어 떨어지는지

            }
            if((i/10)%3==0){
                System.out.print("짝");
            }
        }
        }
    }
}
