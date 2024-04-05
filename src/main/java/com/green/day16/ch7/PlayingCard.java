package com.green.day16.ch7;

public interface PlayingCard {//p.381
    //퍼블릭을 붙일 수 있는 건 파일 명과 같아야 함
    //인터페이스는 객체화 할 수 없다
    //public static final을 자동으로 붙임
    //인스턴스 멤버필드로는 사용할 수 없다 언제나 어디서나 쓸 수 있는 상수용도를 저장
        int CLOVER=1;//인터페이스에서 멤버변수 잘 안 쓰는 편
        //관계 없는 것을 넣지 말 것!

        //메소드는 추상 메소드만 만들 수 있다
        //public abstract이 자동으로 붙음
        String getCardNumber();
    }
interface DeepPlayingCard extends PlayingCard{//상속//혼자서는 의미가 없다 부모로서의 역할만 한다
    String getCardKind();
}
class PlayCard implements DeepPlayingCard{//클래스가 인터페이스를 구현한다는 의미
    //에러 :추상메소드가 있으니 오버라이딩 해라는 강제성
    @Override
    public String getCardKind(){
        return null;
    }
    public String getCardNumber() {
        return null;
    }
}
class Card{
    public static void main(String[] args){
        PlayingCard pc=new PlayCard();//playing 카드의 객체 주소값
        // +나를 상속받은 객체들의 주소값,나를 구현한 인터페이스도 담을수 있다(다형성)
        //오브젝트는 모든 것을 담을 수 잇다.
        pc.getCardNumber();
        DeepPlayingCard dpc=(DeepPlayingCard)pc;
        dpc.getCardKind();
        System.out.println("-------끝-------");
    }
}