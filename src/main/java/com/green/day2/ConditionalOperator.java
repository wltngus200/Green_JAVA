package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args){
        //삼항식, 조건식
        //식?T일때:F일때--->구분은 물음표(?)와 콜론(:)으로 한다
       String s="";
       s=10%2==0?"짝":"홀";
       //T면 앞의 것을 사용
       System.out.println(s);


       int num=(int)(Math.random()*10);
       String h="짝";
       h=num%2==0?"짝":"홀";
       //System.out.print(num%2==0?"짝":"홀")
       System.out.println(num);
       System.out.print(h);
    }
}
