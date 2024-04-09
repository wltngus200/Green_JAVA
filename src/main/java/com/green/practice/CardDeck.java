package com.green.practice;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private String kind;
    private String number;

    private List<CardDeck> cards;

    CardDeck(String kind, String number){
        this.kind=kind;
        this.number=number;
    }
}
class CardDeckTest{
    public static void main(String[] args){
        //cards=new ArrayList();
        String kind="H,S,D,C";
        String[] kindArr=kind.split(",");
        for(int i=0;i<kindArr.length;i++){
            for(int j=1;j<=13;j++){
                String numStr=switch(j){
                    case 1->"A";
                    case 11->"J";
                    case 12->"Q";
                    case 13->"K";
                    default->Integer.toString(j);
                };CardDeck deck=new CardDeck(kindArr[i],numStr);
                //cards.add(deck);
            }
        }
    }
}
