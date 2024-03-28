package com.green.day10;

import java.util.Arrays;

public class ArrayEx7 {
    //셔플
    public static void main(String[] args){
        int[] numArr=new int[10];
        for(int i=0;i<numArr.length;i++){
            numArr[i]=i+10;
        }
        System.out.print(Arrays.toString(numArr));
        System.out.println();
        //인덱스 순서대로 마음에드는 숫자를 골라 그 방과 자리를 바꿈
        int a=0;
        for(int i=0;i<numArr.length;i++){
            int b=(int)(Math.random()*10);
            a=numArr[i];
            numArr[i]=numArr[b];
            numArr[b]=a;
        }
        System.out.print(Arrays.toString(numArr));
        //캐릭터 배열을 프린트ln에게 주면 abc출력, 인트 배열을 주면 주소값 줌
            /* 프린트ln이 오버로딩=창에 입력했을때 목록이 죽-- 뜨는데 이렇게 뜨는 게 오버로딩
            똑같은 이름의 메소드를 여러개 만들 수 있는 기법(구분만 될 수 있다면 여러개)
            네이밍의 부담감 ↓ 오버로딩 오브라이딩은 다른 개념
            객체지향 언어:상속의 개념 오브젝트는 모든 요소의 부모개념 뭐든지 받아들일 수 있음
            똑같은 메소드도 약간의 차이 있을 수
            */

    }
}
