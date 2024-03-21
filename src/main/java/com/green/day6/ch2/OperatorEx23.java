package com.green.day6.ch2;

public class OperatorEx23 {//p.113
    public static void main(String[] args){
        String str1="abc";
        //주소값을 저장함 (str1이 가리키는 주소값)
        String str2=new String("abc");//메모리 저장공간이 달라짐!
        //String str2="abc"; 이면 ==비교 해도 true


        //동일한 주소값을 지녔다면 같은 객체를 불러낸다
        //oop의 개념이 없어서 그런데 new는 완전히 새로운 것
        //TV를 만들어 설치>>새로 만들어서 같은 곳에 설치? 불가

        System.out.println("str1:"+str1);
        System.out.println("str2:"+str2);
        System.out.println("str1==str2 "+(str1==str2));//false
        System.out.println("str1.equals(str2) "+(str1.equals(str2)));//false
        //동등성:지위, 권리, 권한 //동일성: 같다
        //같은 주소값이 있는지 동일한지
    }
}
