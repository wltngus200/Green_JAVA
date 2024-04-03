package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args){
        Card c=new Card();
        c.kind="Spade";
        c.number="A";
        //System.out.printf("kind: %s, number:%s\n",c.kind,c.number);
        System.out.println(c);//카드타입의 변수에 들어있는 것은 카드 객체의 주소값
        //System.out.println(object x) object 최상위 객체 무엇이든 담을 수 있다.
        //주소값을 문자열로 호출 c=>c.toString()
        System.out.println("----------");

        Deck deck=new Deck();
        deck.printAllCard();
    }
}
class Deck{
    final int CARD_NUM=52;//52장의 카드 객체의 주소값을 담을 수 있다
    Card[] cards=new Card[CARD_NUM]; //카드 객체의 주소값 =으로 값을 넣는 것을 명시적 초기화라고 함
    Deck(){//생성자 안에 있는 경우와 밖에 있는 경우->생성자도 메소드의 일종 메소드 바깥에서 대입 이외의 행위는 용인 X
        int idx=0;
        String[] kind={"clover","heart","spade","diamond"};
        for(int i=0;i<kind.length;i++){
            for(int s=1;s<=13;s++){
                Card c=new Card();//객체생성
                c.kind=kind[i];//c에 주소값을 담음
                c.number=switch(s){
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(s);
                };cards[idx++]=c;//이 과정을 거치지 않으면 다 날아버림
            }
        }
    }
    /*
    final int CARD_NUM;
    Card[] cards;

    Deck(){//생성자
        CARD_NUM=52;
        cards=new Card[CARD_NUM];
     */
    //덱을 만드는 메소드 그걸 생성자에

    void printAllCard(){
        for(Card c:cards){
            System.out.println(c);
        }
    }

}
class Card{
    String kind;//무늬
    String number;//숫자
    @Override
    public String toString(){
        return String.format("%s(%s)",kind, number);
    }
}