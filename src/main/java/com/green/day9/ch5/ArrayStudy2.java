package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args){
        int[] numArr=new int[10];//0~99
        for(int i=0;i<numArr.length;i++){
            //이 배열의 기능은 크게 없고 속성(.)이 있는데
            numArr[i]=(i+1);//=쓰기
            //쓰기와 읽기를 항상 별도로! 동시에 하면 재활용성이 떨어짐 코드 관리 유지보수성↓
        }
        for(int i =0; i<10; i++){//0번방에는 1....99번방에 100
            System.out.printf("numArr[%d]: %d\n",i,numArr[i]);//=읽기
        }//배열의 출력을 for문을 활용해도 되지만
        System.out.print(Arrays.toString(numArr));
    }
}
