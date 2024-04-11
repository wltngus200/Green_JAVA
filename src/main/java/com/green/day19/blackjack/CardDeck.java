package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"Spade", "Heart", "Diamond", "Club"};
    public static final int CARD_COUNT = 13;
    private List<Card> list;

    public CardDeck() {//얘를 객체화하면 52개의 카드가 생성되고 그걸 리스트에 담음
        list=new ArrayList();
        for (int i = 0; i < PATTERNS.length; i++) {
            for (int j = 1; j <= CARD_COUNT; j++) {
                String CARD_COUNTstr = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(j);
                };Card c=new Card(PATTERNS[i],CARD_COUNTstr);
                list.add(c);
            }
        }
    }
    void showCards(){
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));//list.get(인덱스) //toString()도 되는데 가로//list도 가능 역시 가로
        }
    }
    /*
    private String getDenomination(int num){//스위치를 메소드화 //내부용으로 쓰기 때문에 프라이빗
        return switch(num){
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(num);
        };
    }*/
    Card draw(){
        int num=(int)(Math.random()*list.size());//size 줄어들면 줄어든 값을 줌
        return list.remove(num);//어레이리스트는 지워지면서 리턴도 가능

    }
}
class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //System.out.println("모든 카드");
        //cd.showCards();//모든 카드의 패턴과 denomination 출력
        //52장의 카드 생성 및 리스트에 추가

        System.out.println("---------------");
        Card c=cd.draw();//랜덤한 카드객체 주소값 리턴+지우기도 필요
        //static 을 쓸 수 없다 이유: 스태틱이 붙으면 인스턴스 멤버필드 사용할 수 없음=이 경우 List<Card>=list
        cd.showCards();//뽑힌 카드가 없어졌다.
        System.out.println("---뽑았다---");
        System.out.println(c);
    }
}
