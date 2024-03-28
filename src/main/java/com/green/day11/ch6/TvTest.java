package com.green.day11.ch6;

public class TvTest {
    public static void main(String[] args){
        Tv tv=new Tv();
        //반복문을 사용하여 100개의 TV를 만들었을 때. 동일한가? 주소값이 동일한가? ㄴㄴ 다 다름 이유: new가 붙어서 new(무조건 새거)
        //Tv tv=new Tv(); Tv tv2=tv; 는 같음
        tv.color="red";
        tv.channel=10;//tv.은 tv를 호출하는 것 값 변경, 사용은 이전과 똑같음 대입= 읽기는 그냥 적기
        tv.power=true;
        //.dot 연산자 점 연산자?
        System.out.printf("tv color: %s, channel:%d,power:%b\n",tv.color,tv.channel, tv.power);

        Tv tv2=new Tv();//주소값이 다른 별도의 tv
        System.out.println("tv==tv2: "+(tv==tv2));
        //소괄호가 없으면 빨간줄이 뜬다 이유는 문자열 + tv로 인식을 하는데 tv는 Tv타입 문자열과 연산 할 수 없다 판단 해버려서
        //레퍼런스 타입들 끼리의 ==비교(문자열이면 문자열, Tv타입이면 Tv타입일 경우)는 주소값이 같은지 비교(동일성비교)
        /*String str="";
        Tv tv=*/
        System.out.printf("tv2 color: %s,channel: %d, power: %b\n",tv2.color,tv2.channel, tv2.power);//디폴트값
        tv2.channel=10;
        tv2.channel=10;
    }
}
