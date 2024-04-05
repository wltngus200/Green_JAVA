package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[] args){
        try{
            System.out.println("---시작---");
            int a=10;
            int b=20;
            //int c=10/0; //0으로 나눌 수 없는 예외상황
            throw new Exception();//exception을 커스텀해 분기문으로 사용할수도
        } catch(ArithmeticException e){
            System.out.println("수학적 예외 발생");
        } catch(Exception e){//최상위 예외 //얘가 맨 위에 있으면 빨간줄
            e.printStackTrace();
            System.out.println("예외발생!");
        } finally{//위의 로직과 관련 있는 것
            System.out.println("[finally] 반드시 실행한다");
        }//아래는 로직과 관련 없는 것
        System.out.println("----끝----");
    }
}
