package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    protected List<Card> cards; //딜러도 바로 사용??
    public Gamer() {
        cards = new ArrayList();
    }
    public void receiveCard(Card card){
        cards.add(card);
    }
    public List<Card> openCards(){
        return cards;
    }
}
class GamerTest{
    public static void main(String[] args){
        Gamer gamer=new Gamer();
        gamer.receiveCard(new Card("스페이드","9"));
        gamer.receiveCard(new Card("하트","2"));

        List<Card> cards=gamer.openCards();
        System.out.println(cards);
    }
}