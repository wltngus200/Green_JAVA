package com.green.TestScore.BaseBall;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //3자리 랜덤수, 1자리 수씩 추출, 볼, 스트라이크, 아웃
        //자리수+숫자 맞으면 스트라이크, 숫자만 맞으면 볼, 아무것도 안 맞으면 아웃
        //자리수 상관 없이 대조해 보는게 문제네?

        /*String strnum=Integer.toString(num);//int(여기선 랜덤값 num)를 문자로
        char[] answer=strnum.toCharArray();//String 문자의 배열로!
        //System.out.println(Arrays.toString(answer)); //['a','b','c'] 처럼 나옴
        //3자리 숫자를 만들고 그것을 문자열로.*/



        //입력받은 숫자도 문자의 배열화
        //System.out.print(Arrays.toString(result)); //['a','b','c'] 처럼 나옴

        PlayBall play=new PlayBall(3);
        System.out.println("3자리 정수값을 입력하세요.");
        int input=scan.nextInt();
        play.ball();

        char[] result=new char[3];
        while(true){
            System.out.print("숫자를 입력하세요.");
            String input=scan.nextLine();
            result=input.toCharArray();
            System.out.print(result);
            }
        //int user;
        /*System.out.printf("%d자리 정수를 중복없이 입력하세요.",NUMBER_COUNT);
        int[] userArr=new int[NUMBER_COUNT];
        user=scan.nextInt();
        for(int i=1;i<=NUMBER_COUNT;i++){
            int tmp=user%10;
            userArr[NUMBER_COUNT-i]=tmp;
            user/=10;
        }*/
        }


        /*int strike=0;
        int ball=0;
        int out=0;
        char[] answer;
        char[] result;//위에
        for(int i=0;i<answer.length;i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[j]==answer[i] && j == i) {
                    strike += 1;
                    continue;
                } else if (result[j] == answer[i] && i != j && result[j] != answer[i]) {
                    ball += 1;
                    continue;
                } else if (result[i] != answer[j] && result[i] != answer[j]) {
                    out += 1;
                    continue;
                }
            }
        }System.out.printf("%d Strike, %d ball, %d out",strike,ball,out);

        //for(int i=0;i<answer.length();i++){
//            char a=answer.charAt(0);
//            char b=answer.charAt(1);
//            char c=answer.charAt(2);
//        if(a)
*/
        //System.out.printf("%d strike, %d ball, %d out");//결과 출력창

    }
class PlayBall {
    int count;
    int[] answer;

    PlayBall(int count) {
        this.count=count;
        int[] Arr = new int[count];
        int[] chose = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < chose.length; i++) {
            int j = (int) (Math.random() * chose.length);
            int tmp;
            tmp = chose[j];
            chose[j] = chose[i];
            chose[i] = tmp;
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = chose[i];
        }
    }

    void ball(int[] user) {
        int strike=0, ball=0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (answer[i] == user[j]) {
                    if (i==j){
                        strike++;}
                    else{
                        ball++;
                    }
                }
            }
        }
        System.out.printf("%d strike, %d ball, %d out\n",strike,ball,(answer.length-strike-ball));
    }
    int[] change(int input){
        int[] numArr={};
        for(int i=0;i<count;i++){
            int val=input%10;
            input=input/10;//val1_copy/=10
        }return numArr;
    }
}