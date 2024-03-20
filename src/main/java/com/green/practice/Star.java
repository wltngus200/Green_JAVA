package com.green.practice;
public class Star {

    public static void main(String[] args){
        for(int i=0;i<5;i++) {//(초기화, 조건식, 증감식) 여기선 i=4까지
            for (int z = 0; z <= i; z++) { //i가 4까지기 때문에 4<=4
                System.out.print("*");
            }
            System.out.println();
        }
        /*

        *       0 - 1
        **      1 - 2
        ***     2 - 3
        ****    3 - 4
        *****   4 - 5
        로 나와야 됨

         */
        //다이아몬드 모양 만들어보자
        /*
        for()
            for()
            for()
            로 되지 않을까
         */
    }
}
