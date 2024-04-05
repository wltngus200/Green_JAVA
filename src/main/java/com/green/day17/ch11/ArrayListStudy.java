package com.green.day17.ch11;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        //리스트에 값넣기=메소드
        list.add(10);//0번방
        list.add(12);//1번방
        list.add(14);//2번방

        list.add("hahaha");
        list.add(14.2341);//자바의 최상위 객체 오브젝트

        Object obj=10;
        Object obj2="haha";
        Object obj3=3.14;

        int r=(int)list.get(0);//형변환 없으면 에러//리스트는 범용 문자열 정수 실수 등 아무거나 격납가능
        r=(int)list.get(1);
        r=(int)list.get(2);
        r=(int)list.get(3);

    }
}
