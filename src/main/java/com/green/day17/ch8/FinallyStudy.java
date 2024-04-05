package com.green.day17.ch8;

public class FinallyStudy {
    public static void main(String[] args){
    method(2);
    }
    public static void method(int val){
        try{
            if(val%2==0){
                return;
            }
        }catch(Exception e){
            System.out.println("예외발생");
        }finally{//위에서 리턴을 만나도 실행하고 종료
            //스트림 유지비 高 반납 한다는 내용
            //finally 안에서도 예외 발생할 수 있어 try catch 사용하기도 함
            System.out.println("finally");
        }
        System.out.println("method 종료");
    }
}
