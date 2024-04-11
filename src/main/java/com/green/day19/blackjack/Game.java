package com.green.day19.blackjack;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT=2;//게임 최초받는 카드 수
    //프라이빗이 좋음->수정할 때 퍼플릭이었으면 넓은 범위에서 사용됨 오류를 줄이기 위해 프라이빗(여기서만 사용됨)
    public void play(){
        System.out.println("=========블랙잭=========");
        CardDeck cardDeck=new CardDeck();
        Dealer dealer=new Dealer();
        Gamer gamer=new Gamer();//주소값을 보냈으니 여기 기능을 이용가능
        Rule rule=new Rule();

        initPhase(cardDeck,gamer,dealer);
        playingPhase(cardDeck,gamer,dealer);

        rule.whoIsWinner(gamer,dealer);

        System.out.println("gamer: "+gamer.openCards());
        System.out.println("dealer: "+dealer.openCards());


    }
    private void initPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer){
        System.out.println("각자 2장의 카드를 뽑아주세요.");
        for(int i=0;i<INIT_RECEIVE_CARD_COUNT;i++) {
            gamer.receiveCard(cardDeck.draw());
            dealer.receiveCard(cardDeck.draw());//호출=지시
            /* 선생님 답=가독성
            Card c3=cardDeck.draw();
            gamer.receiveCard(c3);
             */
        }
        //16점 초과할 때까지 계속 카드 받기
        while(dealer.isMoreReceiveCard()){
            //while문은 isMOre메소드가 true역할을 하니 ==필요없다
            dealer.receiveCard(cardDeck.draw());}

            //gamer.openCards();
            //dealer.openCards();
    }
    private void playingPhase(CardDeck cardDeck,Gamer gamer, Dealer dealer){
        Scanner scan = new Scanner(System.in);
        System.out.println(gamer.openCards());
        //게이머가 0을 입력할 때까지 카드를 뽑는다. 게이머가 카드 객체 주소값 추가로 저장

        while(true){
            System.out.print("카드를 뽑겠습니까? 종료를 원하면 0을 입력하세요.");
            int answer=scan.nextInt();//nextLine + "0".equals(answer);
            if(answer==0){break;}
            else{gamer.receiveCard(cardDeck.draw());
                System.out.println(gamer.openCards());
            }
        }
    }
}
