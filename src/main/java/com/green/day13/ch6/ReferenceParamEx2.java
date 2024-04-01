package com.green.day13.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args){
        int[] intArr ={10,20};
        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0], intArr[1]);

        change(intArr);
        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0], intArr[1]);

        change2(intArr);//30과 100이 나오게
        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0], intArr[1]);

        change3(intArr);//0과 0을 원함
        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0], intArr[1]);

        change4(intArr);//0과 1로 예상
        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0], intArr[1]);
    }
    static void change(int[] numArr){//numArr에 intArr의 주소값이 복사된 상황=어느쪽을 수정해도 수정됨
        for(int i=0;i<numArr.length;i++) {
            numArr[i] += 1;
        }
    }
    static void change2(int[] thirdArr){
        thirdArr[0]=30;
        thirdArr[1]=100;
    }
    static void change3(int[] newArr){
        for(int i=0;i<newArr.length;i++){
            newArr[i]-=newArr[i];
        }
    }
    static void change4(int[] newArr2){
        for(int i=0;i<newArr2.length;i++){
            newArr2[i]=i;
        }
    }
}

