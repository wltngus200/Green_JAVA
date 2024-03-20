package com.green.day5.ch2;

import java.io.PrintStream;

public class Naming {
    public static void main(String[] args){
        //[네이밍 규칙]

        //변수 명명규칙 - 빨간 줄만 안 생기게!(변수, 메소드명 포함)
            //1. 대소문자 구분, 길이제한 x
            //2. 예약어-어떠한 역할을 하는 글자- 사용금지(파란색)
                //ex.public void 등 (String은 되기는 하나 지양할 것)
            //3. 숫자로 시작 X
            //특수문자는 _와 $만 사용 가능 ($가 PHP에서 예약어로서 작용)

        //Class명 명명규칙
            //1. 첫 글자는 무조건 대문자
            //2. 여러 단어로 이루어지면 단어 첫글자를 모두 대문자(파스칼 케이스)
                //ex.LastIndexOf, StringBuffer

        //메소드명 명명규칙
            //1. 여러 단어로 구성된 이름은 카멜케이스 기법을 사용
                //ex.lastIndexOf, happySundayMorning

                //파스칼케이스=단어 첫글자가 모두 대문자
                //카멜케이스=첫 단어 이외 단어의 첫글자 모두 대문자(like 낙타)

        //상수 명명규칙(final)=한 번 명명하면 변경 X
            //1. 상수 이름은 모두 대문자 단어구분 '_'로 구분
                //ex. LAST_INDEX_OF, STRING_BUFFER
            //2. 1번 작성법은 primitive type(=소문자 ex.int, double)일 때 하는 편
                //final String NAME처럼 String도 씀
                //PrintStream ps=System.out;
                    //=> out에 final 내가 가리키는게 바뀌지 않았으면 함
                //마우스를 얹으면 타입이 보임(속성=멤버필드)


    }
}
