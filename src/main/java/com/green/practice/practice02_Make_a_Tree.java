package com.green.practice;
public class practice02_Make_a_Tree {
    public static <Jlabel> void main(String[] args){
        //크리스마스트리 만들기
        /*
        for(int i=0;i<15;i++){
            System.out.print("*".repeat(1+i));
            System.out.println();
        }
        //직각삼각형
        */


        for(int i=0;i<10;i++) { //아래 것을 10줄까지 반복

            for (int j=1;j<10-i;j++) { //-i가 있어 둘째줄이면 1개, 셋째줄이면 2개가 빠짐
                System.out.print(" "); //공백
            }

            for(int k=0;k<i*2+1;k++){ //*2가 있어 둘째줄이면 2개+1개, 셋째줄이면 4+1개
                System.out.print("*");// *
            }
                System.out.println(); //한 줄을 채우면 엔터를 친다
        } //이등변 삼각형 모양 별
    }
}
