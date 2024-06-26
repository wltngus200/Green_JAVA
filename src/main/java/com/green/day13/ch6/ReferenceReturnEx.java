package com.green.day13.ch6;

public class ReferenceReturnEx {
    public static void main(String[] args){
        Numbox nb=new Numbox();//객체생성
        //Numbox nb2=nb;//쉘로우카피 동일 동등
        nb.num=10;//

        Numbox nb2=myCopy(nb);//주소값이 다름(==비교시 false)
        System.out.printf("nb.num: %d\n",nb.num);//10
        System.out.printf("nb2.num: %d\n",nb2.num);//10 //동등하지만 동일하지 않다

        nb.num=200;
        System.out.printf("nb.num: %d\n",nb.num);//100
        System.out.printf("nb2.num: %d\n",nb2.num);//10

    }
    static Numbox myCopy(Numbox xnb){//주의!!! myCopy의 앞에 대입연산자를 보면 void는 아님!
        //카피하려면 무슨 값 들고 있는지는 알아야함 그래서 파라미터로 받아옴
        Numbox xb=new Numbox();
        xb.num=xnb.num;
        return xb;
    }
}
