package com.green.day6.ch3;

public class OperatorEx1 {
    public static void main(String[] srgs){
        int n1=3, n2=5;
        int r1=-n1-n2;//음수, 뺄셈 (-n1)-n2; 가독성 고려 괄호를 활용
        System.out.println("r1: "+r1);

        int r2= n1 + n2 * n1 / n2;//사칙연산과 우선순위가 같음

    //증감연산자 p.93
    int i=5, z=0;
    i++; //쓰기만 하고 있다
    System.out.println("i:"+i);

    i=5;
    ++i; //쓰기만 하고 있다
    System.out.println("i:"+i);

    i=5;
    z=i++; //i가 가진 값을 복사해서 z에게 줘야해서 read write같이
        //read 먼저! i를 가져와서 z에게 줌, 그다음에 올림
        //22 읽기먼저 그다음에 쓰기
    System.out. printf("i: %d,z: %d\n",i,z);

    i=5;
    z=0;
    z=++i;//먼저 쓰고 읽음 i를 먼저 올리고 z에게 줌
    // 22 쓰기먼저 읽기 나중
    System.out. printf("i: %d,z: %d\n",i,z);

    //예제
    System.out.println("-------");
    int k=10;
    System.out.println(k++); // 읽고 올림 10 //k=k++
    System.out.println(++k); // 올리고 읽음 12
    System.out.println(++k); // 올리고 읽음 13
    System.out.println(k++); // 읽고 올림 13
    System.out.println(k); //최종적으로 4번 거쳤으니 14
    }
}
