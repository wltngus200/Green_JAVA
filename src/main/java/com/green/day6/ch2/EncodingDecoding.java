package com.green.day6.ch2;

public class EncodingDecoding {
    public static void main(String[] args){
        char c = 'B';//문자<->숫자
        //자동 형변환 원래는 (int)를 적어줘야함
        //int i=(int)c;
        int i= c;//자동형변환, //22문자를 숫자로 인코딩(=암호화)

        char c2=(char)i; //숫자를 //22문자로 디코딩(=복호화)
        //URL도 한글, 특수문자등을 사용하지 못 하기 때문에 인코딩과 디코딩 과정 있음
        //네이버 검색 후 검색창의 한글>>복사해서 메모장에 넣으면 바뀜(그게 인코딩 되어있는 값)
        //'URL 인코딩 디코딩' 검색
        //각 언어별로 지정된 코드가 달라서 혼선이 발생
        //UTF8이 생겨서 한글 변수명도 가능하나 아직까지 기피
        System.out.printf("c:%c,i:%d, c2:%c\n",c,i,c2);

    }
}
