package com.green.day6.ch2;

public class CastingEx {//p.75~
    public static void main(String[] args){
        //primitive type, reference type 같은 카테고리끼리는 형변환 可
        //위의 경우(인트 <--> 스트링) = 이때는 파싱처리라고 부른다 not 형변환
        //다른 타입끼리는 형변환이 안 된다
        // Wrapper 클래스는 제외
        int n1=10;
        Integer n2=n1;//이 두가지는 거의 비슷
        //22객체기때문에 기능은 더 있지만 차이X
        //객체 구분법 1.타입을 본다 2. n1.(인텔리j의 기능) 빨간 동그라미 m=메소드
        //객체= 속성과 메소드로 이루어짐
        //속성의 명칭=멤버필드 프라퍼티(속성)
        //처음보자마자 속성값을 알 수 없음(캡슐화-보이지 않게 캡슐을 씌움)
        //객체의 멤버필드는 외부에서 바로 볼 수는 없지만 이름을 물어볼 순 있다
        //(이름을 바꾸는 메소드를 통해 컨트롤 가능)

        double d1=10.0;
        Double d2=d1;//==비교도 가능 거의 같음

        //자동형변환 방향 byte>short>int>long>float>double(>String)더하기 연산자일때만(p.83)
        //위의 경우에서 역행하는 경우는 무조건 "강제형변환"

        long l1=100000000L;
        float f1=l1;//22 특정한 값을 계산식으로 암호화 해서 저장한다(오차는있다)
        //22 같은 프라모티브 타입임
        //자동형변환
        System.out.println("f1: "+f1);

        long l2=(long)f1;//타입이 이질적이라 강제 형변환 값의 오차발생에 동의
        System.out.println("l2: "+l2);

    }
}
