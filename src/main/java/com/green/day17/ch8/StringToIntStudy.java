package com.green.day17.ch8;

public class StringToIntStudy {
    public static void main(String[] args){
        int result=Utils.convertStringToInt("12t3");
        System.out.println("result: "+result);
    }
}
class Utils {
    static int convertStringToInt(String str) {
        try {
            int result = Integer.parseInt(str);//정수형으로 변환
            return result;
        } catch (Exception e) {
            return 0;
        }
    }
}