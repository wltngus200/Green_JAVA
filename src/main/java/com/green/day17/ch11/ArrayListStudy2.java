package com.green.day17.ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        //1에서 한 것 처럼 어레이 리스트 작성 X 아무 값이나 넣어도 돼서 형이 통일이 안 되고 꺼낼 때 형변환 필요
        ArrayList<Integer> list =new ArrayList /* 생략도 상관 X <Integer> */ ();
        //레퍼런스 타입만 들어감  <Integer로 제한>=제네릭?
        //객체를 넣음 데이터를 주고 받기

        List<Integer> list2=new ArrayList();//상속관계 주소값을 담을 수 있다.
        //리스트 쪽이 부모 부모가 자식의 주소값을 담을 수 있다.
        //리스트는 implements 로 상속하는 걸 봐서 인터페이스

        list.add(10);
        list.add(20);
        //list.add("우우우")
        int r= list.get(0);
        int r2= list.get(1);


        System.out.println(list);//[10,20]
        list.add(3);
        System.out.println(list);//[10,20,3]
        list.remove(0);
        System.out.println(list);//[20,3]


        //래퍼클래스=원시형의 객체화
        int n1=10;
        Integer n2=10;
        //Interger. r 객체처럼 쓸 수 있음
        System.out.println(n1==n2);//true
        double d1=10.1;
        Double d2=10.1;

        for(int i=0;i<list.size();i++){//size()메소드 length는 상수
            System.out.printf("list.get(%d)>>%d\n",i,list.get(i));

            /*
            링키드 리스트는 각자 흩어져있고 교류통로가 있는 편 주소값을 담고있다
            빈거만들고 거기값넣고 1번방이 가리키던 주소값을 자기 주소값을 변경 자신은 3번방의 주소값을 담는다
            어레이 리스트 배열을 만든가 빼는 작업을 하면 1칸 적은 새로운 배열을 만들고 복사해서 붙여넣기(수정불리)
            add하는 순간 방을 만든다 기존 값 복사+새로운 값
             */
        }

    }
}
