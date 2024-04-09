package com.green.day19;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1 2 3";
        String[] strArr = str.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        int[] numArr=new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i]=Integer.parseInt(strArr[i]);//파싱처리
        }
    }
}
class Exam{

}