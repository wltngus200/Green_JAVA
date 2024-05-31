package com.green.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Oyatsu {
    private static final String ID_REGEX = "^[a-zA-Z0-9]{6,12}$"; // 6~12 글자 영문 대소문자 숫자 0~9 만 가능
    //  "^시작  $"끝? []안에 제한하고 싶은 문자? {}안에 자리수 최소 최대
    private static final String PASSWORD_REGEX = "^(?=.*[!@#$%^&*()-_=+\\\\|\\[\\]{};:'\",.<>/?]).{8,20}$\n"; //영문 8~20 글자 특수문자 1개이상 포함,
    //?=.*는 뭘까... 이스케이프 문자?????
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\." + //아이디
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";


    public static boolean isValidEmail(String email) { //Validation
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        public static boolean isValidPassword(String password) { //Validation
            Pattern pattern = Pattern.compile(PASSWORD_REGEX);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }

        public static boolean isValidId(String id) { //Validation
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{6,12}$");
            Matcher matcher = pattern.matcher(id);
            return matcher.matches();
        }

}
