package com.green.practice;

public class MissionRepeat01 {
    public static void main(String[] args){
        //1. 여러가지 범위의 랜덤 값 출력하기

        //1)3~7까지 랜덤값 출력
        for(int k=0;k<5;k++) {
            for (int i = 0; i < 10; i++) {
                //최소값을 0으로 만들기 위해 양변에 3을 뺀다
                int ran01=(int)(Math.random()*5)+3;
                //★여러개의 랜덤 출력값을 얻고 싶으면 반복함수 안에
                //0~4의 값을 추출할 수 있는 수를 곱한다
                System.out.print(ran01 + " ");
            } //5*10로 50개를 출력해 검토
            System.out.println();
        }
        System.out.println("3부터 7까지의 랜덤 값을 출력");
        System.out.println();

        //2)-5~6까지 랜덤값 출력
            //최소값을 0으로 만들기 위해 양변에 5를 더한다
            //0~10까지의 값을 추출할 수 있는 수를 곱한다
        for(int s=0;s<5;s++){
            for(int h=0;h<10;h++){
                int ran02=(int)(Math.random()*11)-5;
                System.out.print(ran02+" ");
            }System.out.println();
        }//가로로 작성이 끝나고 엔터를 치면 되니까 안쪽 for문 스코프 바깥에 개행 기호
        System.out.println("-5~6사이의 랜덤 값을 출력");
        System.out.println();

        //3)14~16까지 랜덤값 출력
        for(int m=0;m<10;m++){
            for(int n=0;n<5;n++){
                int ran03=(int)(Math.random()*3)+14;
                System.out.print(ran03+" ");
            }System.out.println();
        }
        System.out.println("14~16사이의 값을 출력");
        System.out.println();

        //fall01 여러번 출력하는 것이 아니라 1번 출력한 값을 여러번 반복
                /* ex.1 1 1 1 1
                      1 1 1 1 1
                        ...

            그 때의 풀이 순서
                   1) 최소값을 0으로 만들기 위해 양변에 3을 뺀다
                   2) 0~4의 값을 추출할 수 있는 수를 곱한다
                   3) 5*10로 50개를 출력해 검토

            해결방안
              *for문 안으로 랜덤 추출을 넣어서 해결
                    ->랜덤값을 반복하지 않으면 수치가 바뀌지 않음
                */
    }
}
