package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args){
        char c='A';//문자=작은 따옴표
        int finger=10;
        //리터럴 정수는 int타입
        //long타입 리터럴로 변경하려면 끝에 l(L)붙이면 된다
        long big=100_000_000_000L;//언더바는 별다른 영향을 주지 않는다. 사용자의 자리수 확인용

        System.out.printf("c=%c,%d\n",c,(int)c);
        //보내는 값 처음엔 문자열. 뒤따르는 건 문자열 내 퍼센트 수에 따라 다름.
        //%d=정수 값(바이트 쇼트 인트 롱) %c=문자(캐릭터)

        //퍼센트와 d사이 숫자=차지하는 칸 //대괄호는 가독성
        System.out.printf("finger=[%5d]\n",finger);//우측정렬 =[   10]
        System.out.printf("finger=[%-5d]\n",finger);//좌측정렬 =[10   ]
        System.out.printf("finger=[%05d]\n",finger);//빈칸 대신 0을 넣음 =[00010]
            //이스케이프 문자 \n=%n(다른 언어에서도 되는진 모르겠당)

        System.out.printf("big=%d\n",big);

        //yyyy-mm-dd 포멧 등에 활용
        int year=2024;
        int mon=3;
        int day=20;
        System.out.printf("%4d-%02d-%02d\n",year,mon,day);

        String url="www.green.com";
        float f1=.10f;//0.10f와 동일
            //1.float>>double
            //2.(float)=형변환
            //3. f(F)만 붙이면 리터럴이 float로 바뀜
                //더블이나 롱도 마찬가지(위 참고)
        double d = 1.23456789;

        System.out.printf("url=%s\n",url);
        System.out.printf("f1=%f\n",f1);
        System.out.printf("d=%f\n",d);//=1.234568로 반올림(정확한 값이 아니라 근사치)
        System.out.printf("d=%.2f\n",d);//=1.23 소수점 두 자리에서 끊어 반올림
        System.out.printf("d=%10.2f\n",d);//=(여백)1.23 전체 10자리 중에 소수점은 2자리만
            // 010.2f로 여백을 0으로 채우기도 가능!
        //실수값=%f

        System.out.printf("[%s]\n",url);//일반
        System.out.printf("[%20s]\n",url);//우측정렬
        System.out.printf("[%-20s]\n",url);//좌측정렬
        System.out.printf("[%.8s]\n",url);//자리수 잘림
    }
}
