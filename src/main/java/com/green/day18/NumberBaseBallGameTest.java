package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args){
        NumberBaseBallGame game= new NumberBaseBallGame(3);
        game.start();
    }
}
class NumberBaseBallGame {
    final int NUMBER_COUNT;
    private int[] numArr;
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 9;
    static final int DEFAULT_NUMBER = 3;

    NumberBaseBallGame(final int NUMBER_COUNT) {
        if (NUMBER_COUNT < MIN_NUMBER || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        //numArr=new int[NUMBER_COUNT];
        this.init();
    }//메소드명 리턴타입 파라미터=메소드 3요소

    //메소드명=클래스명 파라미터=생성자 요소
    private void init() {
        this.numArr = new int[NUMBER_COUNT];
        Main:
//반복문에 이름
        for (int i = 0; i < numArr.length; i++) {
            int val = (int) (Math.random() * 9) + 1;
            numArr[i] = val;
            for (int z = 0; z < i; z++) {
                if (numArr[z] == val) {
                    i--;
                    continue Main;
                }
            }
            this.numArr[i] = val;
        }
    }

    void start() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("숫자를 %d개 입력해주세요.(구분은 스페이스)>>>", NUMBER_COUNT);
            String strAnswer = scan.nextLine();
            String[] answerStrArr = strAnswer.split(" ");//문자열의 배열로
            int[] answerNumArr = new int[NUMBER_COUNT];//같은 수의 정수 배열 생성
            for (int i = 0; i < NUMBER_COUNT; i++) {
                answerNumArr[i] = Integer.parseInt(answerStrArr[i]);
            }
            if (numArr.length != answerNumArr.length) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            int strike = 0, ball = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int j = 0; j < NUMBER_COUNT; j++) {
                    if (numArr[i] == answerNumArr[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            if (strike == NUMBER_COUNT) {
                System.out.println("정답!!");
                break;
            }
            System.out.printf("%d strike %d ball %d out\n", strike, ball, NUMBER_COUNT - (strike + ball));
        }
    }
}
