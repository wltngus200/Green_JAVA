package com.green.day15.ch7;

import com.green.day14.ch6.MyArrays;

import static com.green.day14.ch6.MyArrays.printArr;//static 붙이고 메서드 이름

public class PackageTest {
    public static void main(String[] args){
        //패키지 사용이유
        //자바파일을 관리하기 위해(분류용도)
        //똑같은 이름의 클래스를 구분 하기 위해
        //day 13, day12 모두에 Card라는 클래스 존재
        //임포트를 하면 패키지명.card을 쓰지 않고 Card로 소환 가능
        // 단, 같은 이름의 클래스 2개 임포트 불가->하나는 임포트, 하나는 day12.ch6.Card();로 사용
        //도메인 주소

        //day14 MyArrays
        int[] arr={1,2,3};
        MyArrays.printArr(arr);
        printArr(arr);//임포트에 저렇게 하면 이렇게 클래스 없이 사용 가능
        //ttd 내가 잘 만든 코든지 검사하는 코드 //이거 하고 사람들도 테스트를 함
        //알파테스트 회사 내 테스트 //베타 테스트 출시 전 외부 사용자 테스트

        //static 멤버필드, 메소드 (이너클래스)
        //스태틱이 안 붙은 애는 스태틱을 사용할 수 있다. 반대는 안 됨
        //인스턴스 멤버필드 메소드가 필요한 이유->하나의 값을 바꾸면 다른 것도 바뀌어버림(스태틱은 공간이 1개)
        //static 은 객체별로 값을 저장하는 용도X

    }
}
