package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;
import com.green.day27.HanilWoofer;
import com.green.day27.MartenWoofer;

public class TvFactory {
    //싱글톤 TvFactory를 딱 1개만 객체생성해서 돌려쓰기
    //객체를 2개 이상 만들 수 없도록 구조를 잡고 주소값을 요구하면 계속 같은 값만 제공
    //MC패턴 (모델 컨트롤러) M 데이터베이스  V는 통신  MVC패턴, MVVM
    private static TvFactory tvFactory;
    public static TvFactory getInstance(){
        if(tvFactory==null){
            tvFactory=new TvFactory();
        }
        return tvFactory;//최초는 null이지만 이후엔 계속 같은 주소값
        //싱글톤은 멤버필드가 있으면 문제될 가능성이 있다(이후 스프링이 만들어줌)
    }
    private TvFactory(){}//프라이빗이라 외부에서 사용불가 위의 메소드로만 사용가능

    public Tv factory(String tvName, String speakerName, String wooferName){
        Woofer woofer=switch(wooferName){//인터페이스지만 부모이기 때문에 주소값을 담을수 있다
            case "hanil"->new HanilWoofer();
            case "marten"->new MartenWoofer();
            default -> null;//null들어가면 에러발생
        };
        //들어온 woofer문자열로 그 제품의 주소값을 우퍼 객체에 저장
        Speaker speaker=switch(speakerName){
            case "bose"->new BossSpeaker(woofer);
            //외부에서 객체생성을 하고 그 주소값을 넣는 형태 DI
            case "genelec"-> new GenelecSpeaker(woofer);
            default -> null;
        };

        //스프링은 파일을 읽고 그 파일의 값을 가져오는 방식


        //들어온 speaker문자열로 스피커객체에 주소값 저장
        Tv tv=switch(tvName){
            case "lg"->new LgTv(speaker);
            case "apple" -> new AppleTv(speaker);
            default -> null;
        };
        //들어온 tv문자열로 tv기종 결정
        // 우퍼⊂스피커⊂TV 스피커를 생성하면 그 안엔 이미 특정 우퍼 주소값이 담겨있다.
        //DI는
        //IOC는 스피커 우퍼가 들어갈 공간을 비워둔 상태??
        return tv;
    }
}
