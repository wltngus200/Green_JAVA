package com.green.day11.ch6;

public class ObjectStudy1 {
    public static void main(String[] args){
        /*

        OOP 객체지향-Object Oriented Programming <-> 절차지향(C언어)
                //객체들끼리 유기적으로 해서 해결
                //절차지향은 정리하기가 복잡
        과거엔 소프트웨어 크기가 작아서 객체지향에 회의적이었다
        ui=User interface -조금 더 나아간 거-> ux=user experience (화면에서 움직이는 것)
            inter= 서로의, face= 직면하다 다른 이종 성격을 연결 / 캐릭터 -> □|○ <-사용자 연결
                //게임 창, 캐릭터, 키보드 모두 인터페이스
            experience x버튼을 누르면 꺼진다=경험 그러한 경험에 맞춰 화면 디자인
                //동떨어져 개발하면 혼란 ->만족도 ↓
                //문학 역사 철학 등에 해박하면 쉽다?
            Framework, Library=남이 만들걸 쓰는 거 는 같음. 이용방식 차이
            -라이브는 주도권을 내가 가짐 내가 마음대로 할 수 있음
                자동차를 운전한다
            -프레임워크는 주도권을 쟤가, 쟤의 룰에 맞춰 만들면 득 볼수 있다. 소스 코드를 유지하며 디자인 패턴 들어가 있음(오픈 소스),학습필요
                서킷을 돌다가 부산을 가버린다 ex. 안드로이드 ios 리액트 등이 프론트의 프레임워크
                //프레임워크는 내가 안으로 들어가서 해야됨, 안에 약속이 있는데 그걸 배워야 함
                //웹서버 만들때 주로 사용
                //라이브러리 자바 개발자= 문법만 알면 사용 단 매서드는 알아야
            EJB(옛날 프레임워크)가 어려워서 개발 어렵고 학습도 낮음. 자바의 침체 봄이 왔다는 의미로 Spring


        자바의 특징
        1.OS의 독립적: 리눅스에서도 윈도우에서도 들릴 수 있다.>JVM(JRE안에 JVM포함) jre만 있으면 jvm이 포함 jvm이 있으면 어디서든 가동
            //c#(마이크로 소프트)이 자바를 잡으려고 나옴 언어의 우수성만 따지면 자바보다 높음
            //델파이라는 상용 언어 존재 빌딩속도도 런타임 속도도 빨라 점유율이 높음
            //델파이 개발자가 C#개발에 참여(당시 윈도우에서만 돌아감->현재는 다 돌아감)
            //비쥬얼 스튜디오?(VS)
            3.닷컴 붐이 불었을 때 수혜->자바의 급부상
            -자바는 원래 세탁기같은 곳에 들어가려고 만들어졌었는데 시대를 잘 탐

        2.객체지향 언어=객체지향 언어의 공통 특징 두가지 컨셉
            -class(그 외의 언어) prototype(자바스크립트)

        4.Class와 (객체 instance) 관계 //설계도와 설계도로 실체화 된 무언가
            -클래스는 문서 램에 올라가지 않은 문서=문자열의 조합/현실에서 종이에 적어놓은 것 =>설계도
            -객체는 내가 설계도를 토대로 만드는 것. 그 과정을 객체화 (인스턴스)라고 함
            -class는 문서에 가까움(static이 없을 때) instance(실제)

        5.객체의 구성요소
            -속성    멤버 필드=property=멤버 변수=전역변수
                ex. 크기 높이 길이 색상 볼륨 채널 만든 회사 등등 (값에 가까운 것)
                //(멤버) 메소드==기능
                //속성 값을 저장하기 위한 공간
                //메소드 외부에서 들어오는 값, 내부에 있는 값을 이용해 값을 변경. 가공
            -메소드 멤버 메소드 =니가 객체가 된다면 이런 행동을 해 (=기능)
                ex.켜기 끄기 볼륨 올리고 내리기 채널 변경하기 음소거 등등 (동작)

        6.객체 생성(인스턴스화 객체화 ) 문법
            class명 변수명 = new 클래스명();('클래스명()'=생성자(생성자 중에서도 기본 생성자), 소괄호 사이에 뭐가 있으면 오브라이딩?)
                //클래스 명은 레퍼런스 변수타입으로도 설정
                //객체 생성을 위해선 new를 반드시 써야함
            예외 String sta="dddddd"; 많이 써서 예외시켜줌
                String str2=new String("ddddd"); 둘이 미묘하게 다름
                //유일하게 String만
            Tv tv= new Tv();
            레퍼런스타임<->프라머티브타입은 8개//실수를 하지 않으면 100% 레퍼런스는 대문자 -> 클래스를 만들 때 대문자로 시작
             객체의 주소값 저장 /'Tv tv'에는 Tv객체의 주소값만 저장할 수 있음을 의미
             Tv라는 클래스를 객체화 할 건데, 그 주소값이 변수에 저장 //
             클래스명(): 컨스트록터?=생성자 new 키워드로 생성자를 소환해야 객체를 쓸 수 있다.
             안 넣고 생성하는 지금 같은 경우= 기본생성자 디폴트 컨스트록터
         */

    }
}
