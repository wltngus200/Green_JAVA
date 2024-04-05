package com.green.practice;

import java.util.Arrays;

public class PracToString {
    public static void main(String[] args){
        HelpMe help=new HelpMe();
        help.plus(10);
        System.out.println(help);//println(.toString) 실패!
        help.plus(20);
        System.out.println(help);//객체 help의 주소값을 넣어줬기 때문에 클래스 HelpMe에서 오버라이딩?
    }
}
class HelpMe {
    private int[] home;//나 home이라는 배열 만들거야! 값(=길이)은 몰라!라는 통보=선언

    HelpMe() {
        home = new int[0];
    }//HelpMe 타입의 객체를 생성하면 home이라는 길이 0의 배열을 만들어!

    void plus(int val) {
        int[] tmp = new int[home.length + 1];//home보다 한 칸 큰 tmp라는 배열을 만들어!
        tmp[home.length] = val;//마지막 방에 val값을 넣는다
        /* home의 길이 0(선언만 된 상태), tmp의 길이 0+1=1(1칸 가짐)
        마지막 방번호는 길이-1이지만 tmp-1을 하는 것 보다 home을 쓰는 것이 수식이 필요 없고 좋다.*/
        //plus 1번째: home은 선언만, tmp={10}
            //plus 2번째: home={10}, tmp={0,20}
        home = tmp;//주소값을 복사해 같은 배열로 만든다(쉘로우카피)
        //plus 1번째: home=tmp={10}, 지역변수 tmp는 스코프를 벗어나 사라짐 전역변수 home는 유지
            //plus 2번째 home=tmp={0,20} 새로 값을 덧씌워버려서 기존 {10}은 없어진다 역시 tmp는 사라지고 home은 유지
    }
}

    //@Override String toString 모르겠당!
