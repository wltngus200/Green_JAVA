package com.green.day13.ch6;

public class PrimitiveRefEx {//p.265
    public static void main(String[] args){
        int num=10;//primitive 타입
        Numbox nb=new Numbox();
        nb.num=10;//레퍼런스타입

        changeNum(num);//메소드 이름이 changeNum+같은 클래스 안에 존재한다+파라미터로 1개의 정수값을 받는다
        //static 메소드=객체화 하지 않았다
        System.out.println("num: "+num);

        changeNum(nb);
        System.out.println("nb.num: "+nb.num);
    }

    public static void changeNum(int n){//num=10을 복사해옴 동등하지 동일 X, 스코프가 다름
        n=100;
    }
    public static void changeNum(Numbox n){//nb와 다른 존재 주소값을 복사해주었을 뿐 같은 값을 들고있는 동등한 존재
        //n=new Numbox();//다른 존재라는 증거 //공간이 다름 다른 값을 저장할 수 있다.
        //새로운 공간을 만들고 주소값 복사 다른 값 주게
        n.num=1000;//매개변수 스코프가 끝나면 사라질 존재
        /*
        스택메모리에 1.nb라는 지역변수 할당 3.numbox의 주소값을 복사받음 5.numbox n에 주소값 복사 7.n은 스코프가 끝나 지워짐
        힙메모리 2.numbox의 객체에 공간 할당(주소값 생김) 4. 10으로 변경 명령 받음 6. n이 100으로 바뀌라고 찾아옴 7.nb가 찾아와 값을 읽음
        nb는 객체를 가리키고 있다

        //n=new Numbox();의 해설
        스택메모리 1.n에 주소값을 복사해줬음(쉘로우카피) 3.그걸 다시 주소값을 받음
        힘메모리에서 2.새로운 객체 생성
         */
    }
}
class Numbox {
    int num;
}