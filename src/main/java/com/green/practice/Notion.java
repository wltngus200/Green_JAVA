package com.green.practice;

import com.green.day12.ch6.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static com.green.practice.Oyatsu.*;
import static java.util.Objects.hash;

public class Notion {
    public static void main(String[] args) {
      String id1="a"; //글자수 미달
      String id2="aa1212"; // true
      String id3="wltngus200"; // true
      String id4="Sting423541584481545"; // 글자수 초과
      String id5=""; //없음


      System.out.println(isValidId(id1)); //false
      System.out.println(isValidId(id2)); //true
      System.out.println(isValidId(id3)); //true
      System.out.println(isValidId(id4)); //false
      System.out.println(isValidId(id5)); //false


      if(!isValidId(id1)){
        System.out.println("answer: false");
      }else if(!isValidId(id2)){
        System.out.println("answer: true");
      }

      System.out.println("PASSWORD");

      String pw1="#$%RWE$^"; //false
      String pw2="aaa"; //false
      String pw3="aaaaaaaa"; //false
      String pw4="abcd04+1"; //true
      String pw5="#@$@#%@#%%"; //true
      String pw6="$#^J@Jdnj"; //true
      String pw7="1234567890"; //true

      //이게 자바에서 복사하냐 다른 데서 복사하냐 따라 또 다름 ㅠㅠ
      final String PASSWORD_REGEX = "^(?=.*[!@#$%^&*()-_=+\\\\|\\[\\]{};:'\",.<>/?]).{8,20}$\n";
      System.out.println(PASSWORD_REGEX);
      System.out.println(isValidPassword(pw1));
      System.out.println(isValidPassword(pw2));
      System.out.println(isValidPassword(pw3));
      System.out.println(isValidPassword(pw4));
      System.out.println(isValidPassword(pw5));
      System.out.println(isValidPassword(pw6));
      System.out.println(isValidPassword(pw7));
    }
}
