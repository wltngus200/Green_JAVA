package com.green.day12.ch6;

public class MyMethodTest {
    public static void main(String[] args){
        MyMethod mm=new MyMethod();//MyMethod를 mm으로 객체화
        mm.checkOddEven(71);//홀,짝수입니다 mm으로 객체화 된 MyMethod안의 checkOddEven 메소드
        mm.checkOddEven(29);//홀,짝수입니다
        mm.checkOddEven(36);//홀,짝수입니다
        mm.checkOddEven(54);//홀,짝수입니다

        int r=mm.abs(-62);//절댓값
        System.out.println(r);
        r=mm.abs(7);
        System.out.println(r);

        //내가 보낸 값의 0~99까지 랜덤
        int randomValue=mm.getRandomValue(10);//0~9
        System.out.println(randomValue);
        randomValue=mm.getRandomValue(100);//0~99
        System.out.println(randomValue);

        mm.printGugudan(9);

        //파라미터만 다르면 똑같은 이름의 메소드를 만들 수 있다
        //=오버로딩
        int randomValue2=mm.getRandomValue(5,31);//최솟값~최댓값
        System.out.println(randomValue2);

        System.out.println();

        //구구단 인트값 2개 받아서 n단부터 m단까지
        mm.quizGugudan(1,5);
    }
}
//클래스 안에는 비슷한 것 끼리 모아야 함
//위치파악(패키지??)>리턴,void>메소드명>파라미터
class MyMethod{
    void checkOddEven(int n){
        String an=(n%2==0?"짝수":"홀수");
        System.out.printf("입력하신 숫자는 %d이며, %s입니다.\n",n,an);//한 줄로도 가능
    }

    int abs(int num){
        int a=(num<0?-num:num);
        return a;
    }

    int getRandomValue(int num){
        int rand=(int)(Math.random()*num);
        return rand;
    }
    void printGugudan(int a){
        for(int i=1;i<10;i++){
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }
    }
    int getRandomValue(int min, int max){
        int rand=(int)(Math.random()*max)+min;
        //rand=(int)(Math.random()*(max-min))+min
        int k=rand>max?rand-min:rand;
        return k;
    }
    void quizGugudan(int n,int m){
        for(int i=n;i<=m;i++){
            for(int x=1;x<10;x++){
                System.out.printf("%d x %d = %d\n", i,x,x*i);
            }System.out.println("------------");
        }
    }
}
