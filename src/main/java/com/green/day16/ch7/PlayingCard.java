package com.green.day16.ch7;

public interface PlayingCard {//p.381
        //public static final을 자동으로 붙임
        int CLOVER=1;//인터페이스에서 멤버변수 잘 안 쓰는 편
        //관계 없는 것을 넣지 말 것!
        //메소드는 추상 메소드만 만들 수 있다

        //public abstract이 자동으로 붙음
        String getCardNumber();
    }
interface DeepPlayingCard extends PlayingCard{
    String getCardKind();
}
class PlayCard implements DeepPlayingCard{//에러 :추상메소드가 있으니 오버라이딩 해라는 강제성
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
        PlayingCard pc=new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dpc=(DeepPlayingCard)pc;
        dpc.getCardKind();
        System.out.println("-------끝-------");
    }
}