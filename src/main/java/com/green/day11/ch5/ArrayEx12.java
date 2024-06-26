package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args){
        String[] names={"Kim","Park","Lee"};
        //스트링 객체의 주소값을 담을 수 있는 배열
        //출력하고 싶은 이름을 출력,대입 names[1]
        //구분을 하는 능력이 중요
        //프라모티브 레퍼런스의 차이는 값과 주소값 저장의 차이
        //String aa=""는 객체의 주소값
        //names에 저장하는 건 배열의 주소값

        System.out.println(names);//주소값
        System.out.println(Arrays.toString(names)); //배열

        names[0]="Yu";
        System.out.println(names[0]);
        System.out.println();

        //일반 for문
        for(int i=0;i<names.length;i++){
            String val = names[i];
            System.out.printf("val: %s\n", val);
        }
        System.out.println();

        //향상된 for문 foreach문 p.166
        //시퀀스= 0번방 1번방 있는 애들은 이걸 사용
        //변경하는게 목적이 아님 읽어오는 것이 목적
        for(String val:names){//콜렉션을 담아줄 친구:콜렉션(값이 여러개인 친구)
            System.out.printf("val:%s\n",val);
            //배열의 값을 변경하고 싶으면 포이치 안됨
            //객체의 주소값을 불러오기 때문에 객체는 변경가능
            //연달아있는 집 3개는 바꿀 수 없지만 집 안의 상자에 공을 넣고 빼고는 나의 영역

        }
    }
}
