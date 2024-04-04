package com.green.day4;

import java.util.Scanner;

public class MissionSumWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int input = 0;
        //입력한 숫자를 모두 더한 값 출력하기


        while (true) {
            System.out.print("숫자를 입력해주세요.(종료:0)");
            input = scan.nextInt();
            if (input != 0) {
                sum = sum + input;
            } else {
                break;
            }
        }System.out.println(sum);

         /*   while(true) {//첨은 true라서 돌아감 do while처럼.
                System.out.print("숫자를 입력해주세요.(종료:0)");
                input = scan.nextInt();
                if (input == 0) {//왜 끊어지지??
                    break;}//input이 0이니까
                } else {
                sum = sum + input;
                }
                //라인이랑 괄호 맞춰서 다시!
                //종료랑 sum이 계속 같이 뜨면서 진행됨
                System.out.println("종료");
                System.out.println(sum)//괄호 지키기
          */


        //선생님 풀이
        while(true) {//첨은 true라서 돌아감 do while처럼.
            System.out.print("숫자를 입력해주세요.(종료:0)");
            input = scan.nextInt();
            if (input == 0) { break;}
            sum = sum + input;
            //sum과 if의 위치가 바뀌면 굳이 0을 더하는 작업을 하게 됨
        }
        System.out.println("종료");
        System.out.println(sum);

        }
}
