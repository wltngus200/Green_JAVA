package com.green.day19.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT=16;

    public boolean isMoreReceiveCard() {
        int score = 0;
        for (int i = 0; i < cards.size(); i++) {
            //프로텍티드라도 자손클래스(다른 패키지에 있는 것도)접근 가능!
            //별도로 선언할 필요 없다!
            Card c = cards.get(i);//리스트의 값을 받아오는 법! 배열과 다르다 arr[i]<->list.get(i)
            score += c.getPoint();
        }//다른 데도 쓰이면 메소드로 관리
            return score <= CAN_RECEIVE_POINT;
    }
}
class DealerTest{
    public static void main(String[] args){
        Dealer dealer=new Dealer();
        dealer.receiveCard(new Card("Heart","K"));
        dealer.receiveCard(new Card("Spade","K"));
        boolean answer=dealer.isMoreReceiveCard();
        System.out.println(answer);
    }
}