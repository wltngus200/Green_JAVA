package com.green.TestScore.Hang;

public class Hang2 {//p.470
    public static void main(String[] args){
        String word="941";
        String word2=word.replace('w', 'f');//앞의 값을 뒤의 값으로 변경
        System.out.println(word2);

        int idx=word.indexOf('1');//해당 문자가 몇 번째 인덱스에 있는지 딱 1번 알려줌
        //for문? 더 복잡하려나
        System.out.println(idx);

        String num="175";
        int idx2=word.indexOf(num.charAt(0));
        System.out.println(idx);
    }

}
