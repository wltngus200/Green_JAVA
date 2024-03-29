package com.green.TestScore;

import java.util.Scanner;

public class BBG_2_ReStart {
    public static void main(String[] args) {
        /*
        새로운 필드 개척 **세 자리에 중복되는 숫자는 없다!
        0. 수식이 맞는지 확인할 임시 수치 입력
        1. 중복이 없다면 겹치는 숫자가 있는지를 먼저 확인한다
            -있다면 볼 or 스트라이크
            -없다면 아웃
        2. 반복의 첫번째 순환에서 볼 or 스트라이크가 나온다면 뒤는 체크할 필요 X
            -컨티뉴로 다음 순환을 시작한다
        3. 아웃은 별도로 지정하지 않고 3에서 스트라이크와 볼을 뺀 수치를 넣어 오류를 줄인다.
                                ...
        */



        char[] answer = {'1', '2', '3'};//공식이 맞는지 확인을 위한 임시치 부여

        Scanner scan = new Scanner(System.in);//사용자에게 값을 입력받는 상황

        int strike = 0; //자리수와 문자 모두 일치
        int ball = 0; //문자만 일치

        do {System.out.print("3자리 숫자를 입력해 주세요.");
            int input=scan.nextInt();//사용자에게 값을 입력
            String strnum=Integer.toString(input);//int를 문자로
            char[] user=strnum.toCharArray();//String 문자의 배열로!
            strike=0;
            ball=0;
            for (int b = 0; b < answer.length; b++) {
                for (int g = 0; g < user.length; g++) {
                    if (answer[b] == user[g]) {
                        if (b == g) {
                            strike++;
                            continue;
                        } else {
                            ball++;
                            continue;
                        }
                    }
                }
            }
            System.out.printf("%d strike %d ball %d out\n", strike, ball, 3-(strike+ball));
        }while(strike!=3);
    }
    //while 문을 반복할 수록 수치가 이상해짐 아웃이 -3이 된다거나//이건 해결한 거 같은데
    //while문 안에 스트라이크 볼 아웃을 넣으면 스코프 밖에서 그 값을 출력할 수 없고 넣자니 오류가 나넹 ㅎ
}
/*  와일문 만들기, 매소드 활용, 랜덤값 부여 input 값 수정 */

/*
        while(true){
            System.out.print("숫자를 입력하세요.");
            String input=scan.nextLine();
            char[] result=input.toCharArray();//문자열을 문자의 배열로 교체
            if(answer[0]==result[0] && answer[1]==result[1] && answer[2]==result[2]) {
                break;
            } else {

            }System.out.println("정답입니다.");
        }*/
