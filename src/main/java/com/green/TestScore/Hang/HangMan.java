package com.green.TestScore.Hang;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words={"actor", "address", "afternoon", "aggressive",
                "baggage", "basic", "bedroom", "benefit",
                "capacity", "ceremony", "criminal", "consumer",
                "delivery", "development", "diamond", "downtown",
                "embarrassment", "entertainment", "exchange", "exhibition"};
        int idx=(int)(Math.random()*words.length);
        String input_answer=words[idx];
        char[] answer = input_answer.toCharArray();//문제를 문자열로 전환
        //System.out.println(Arrays.toString(answer));//정답확인용


        //char[] answer_copy=answer; //미스! 주소값 복사를 해버려 카피를 바꾸면 다같이 바뀌어버림
        char[] answer_copy = new char[answer.length];
        for (int i = 0; i < answer.length; i++) {//배열을 복사하여 글자 개수만큼 언더바로 표시
            answer_copy[i] = '_';
        }//위의 부분을 별도의 파일에서 메소드 하고 값을 입력받아오기
        System.out.println(answer_copy);//빈칸 제공
        /*
        System.out.println(answer);=bedroom
        System.out.println(Arrays.toString(answer));[b,e,d,r,o,o,m]
        */

        char input_user;
        while (true) {//올바르지 않은 값이 입력되었을 때의 분기문
            System.out.print("알파벳을 입력하세요.");
            String choice = scan.next();
            if (choice.length() == 1) {
                input_user = choice.charAt(0);
                if (input_user >= 97 && input_user <= 122) {//a=97 z=122 유니코드로 소문자 알파벳으로 제한
                   HangCheck check=new HangCheck();
                    check.hangCheck(input_user,answer,answer_copy);
                        if(Arrays.equals(answer,answer_copy)){
                        System.out.println(answer);
                        System.out.println("정답입니다.");
                        break;
                    }
                } else {
                    System.out.println("입력이 올바르지 않습니다.");
                    System.out.println("영어 소문자를 입력하세요.");
                }
            }else {
                System.out.println("입력이 올바르지 않습니다.");
                System.out.println("한 글자만 입력하세요.");
            }System.out.println(answer_copy);
        }
    }
    }

    class HangCheck {
        void hangCheck(char v, char[] ans, char[] copy) {
            char input_user = v;
            char[] answer = ans;
            char[] answer_copy = copy;
            for (int i = 0; i < answer.length; i++) {//반복을 통해 입력한 문자가 배열에 있는지 확인
                if (input_user == answer[i]) {
                    answer_copy[i] = input_user;
                }
            }
        }
    }













