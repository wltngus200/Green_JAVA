package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args){
        NumberBaseBallGame game= new NumberBaseBallGame(3);
        game.showArr();
    }
}
class NumberBaseBallGame{
    final int NUMBER_COUNT;
    private int[] numArr;
    static final int MIN_NUMBER=1;
    static final int MAX_NUMBER=9;
    static final int DEFAULT_NUMBER=3;

    NumberBaseBallGame(final int NUMBER_COUNT){
        if(NUMBER_COUNT < 1 || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        //numArr=new int[NUMBER_COUNT];
        this.init();
    }//메소드명 리턴타입 파라미터=메소드 3요소
    //메소드명=클래스명 파라미터=생성자 요소
    private void init(){
        this.numArr=new int[NUMBER_COUNT];
        Main://반복문에 이름
        for(int i=0;i<numArr.length;i++){
            int val=(int)(Math.random()*9)+1;
            numArr[i]=val;
            for(int z=0;z<i;z++){
                if(numArr[z]==val){
                    i--;
                }
            }
        }
    }
    void showArr(){
        int strike, ball, out;
        //}System.out.printf("%d: %d strike %d ball %d out",user,strike,ball,3-(strike+ball));
    }
}