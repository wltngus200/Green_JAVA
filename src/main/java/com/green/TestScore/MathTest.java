package com.green.TestScore;

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int nine=Star(1,2,3);
        System.out.println(nine);
        String nice=Hello(5,"안녕 ");
        System.out.println(nice);

        //메서드 바로 출력도 가능한가 -> Ok!
        System.out.print(Hello(3,"성공 "));
        System.out.println();

        //제곱수 출력
        System.out.print("제곱할 숫자를 입력하세요");
        int input=scan.nextInt();
        System.out.println(square(input));

        //원 지름을 넣으면 반지름과 원주와 넓이 출력
        System.out.print("원의 지름은 얼마입니까. 직경: ");
        double r=scan.nextDouble();
        System.out.print(circle(r));
        //메소드에 속아 메인을 잊지 말자ㅋㅋㅋ

    }
    static int Star(int a,int b,int c){
        //내가 리턴할 값이 무엇이냐에 따라서 메소드명 설정
        int i=(a+b)*c;
        //star(인수들인듯 그래서 star(인수, 인수, 인수)로 바깥에서 소환
        return i;
    }
    static String Hello(int d, String e){
        String meet=e.repeat(d);
        return meet;
    }
    static String prac(int r, String s){
        String Hard=s.repeat(r);
        return Hard;
    }
    static int square(int a){
        int num=a*a;
        return num;
    }
    static String circle(double r){//인수 더블로 하면 정수 넣으면 에러?
        final double CHERRY=3.14;
        //1가지 값만 반환 할 수 있기 때문에 배열 활용
        String[] ji=new String[4];
        String won="원의 지름: "+r+
                "\n원의 반지름: "+r/2+
                "\n원의 둘레: "+r*CHERRY+
                "\n원의 넓이: "+(r/2)*(r/2)*CHERRY+"입니다.";
        return won;
    }
}
