package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args){
        //int star=3~7랜덤값
        int star=(int)(Math.random()*5)+3;
        System.out.println(star);//값에 따른 별 찍기 1부터

        //0번째에 1개, 1번째에 2개...(0-1,1-2,2-3,3-4....)

        System.out.println("방법1");

        for(int i=0;i<star;i++) {//for문 돌때마다 i 값이 1씩 증가(0,1,2...(star-1)까지)=줄
            //star 내가 사이즈 5의 별을 찍고싶다
            for (int z=0; z<=i; z++) {//(초기화, 조건식, 증감식)
                //0(z)<=0(i) true이기 때문에 1번 실행 1<=1 2번 실행
                //i의 최대값=(star-1) 0~(star-1) 반복=star회 반복
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("방법2");

        for(int s=1;s<=star;s++){//1,2,3...star까지 = 줄 개수
            for(int h=0;h<s;h++){//0<1트루여서 1번 /s의 최대값=star
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int j=0;j<star;j++){//star만큼 줄 수 반복
            for(int j2=0;j2<=j;j2++){
                System.out.print("*");
            }
            System.out.println();
            //
        }
    }
}
