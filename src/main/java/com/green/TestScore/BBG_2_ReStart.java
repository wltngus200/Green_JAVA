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

        Scanner scan = new Scanner(System.in);
        char[] answer = {'1', '2', '3'};//공식이 맞는지 확인을 위한 임시치 부여
        char[] user = {'5', '9', '3'}; //1 스트라이크 0 볼 2 아웃

        int strike = 0; //자리수와 문자 모두 일치
        int ball = 0; //문자만 일치
        int out = 0; //문자가 들어가지 않음

        for(int b=0;b<answer.length;b++){
            for(int g=0;g<user.length;g++){
                if(answer[b]==user[g]){
                    if(b==g){
                        strike++;
                        continue;
                    } else {
                        ball++;
                        continue;
                    }
                }//out=3-(strike+ball);
            }//out=3-(strike+ball);  //어디에 오느냐에 따라 수치차이가 보임
        }//out=3-(strike+ball);
        System.out.printf("%d strike %d ball %d out", strike, ball, out);



        //0-012 1-012 2-012로 순환
/*
        for (int i = 0; i < user.length; i++) { //user의 값
            for (int j = 0; j < answer.length; j++) { //answer의 값
                if (i == j && user[i]==answer[j]) {
                    //끝자리로 가면 옳지 않은 결과->why??/
                    strike+=1;
                    break;
                } else if (i!=j && user[i]==answer[j]) {
                    ball += 1;
                    break;
                } else {
                    out+=1;
                }//아웃 제외 1칸에 들어가면 ㅇ그 외 상관 없잖아
                //중복금지니까
            }
        }System.out.printf("%d strike %d ball %d out", strike, ball, out);
*/
    }
}


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
