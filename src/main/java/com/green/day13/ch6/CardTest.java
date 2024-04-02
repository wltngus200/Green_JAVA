package com.green.day13.ch6;

public class CardTest {
    public static void main(String[] args){
        String[] shapes={"Heart","Diamond","Clover","Spade"};//일관성이 없어서 배열 추천
        Card[] cards=new Card[52]; //Card[][]=new Card[4][13]도 있으나 뽑기가 곤란

        int idx=0;
        for(int k=0;k<shapes.length;k++) {
            for (int i = 1; i <= 13; i++) {
                //System.out.println(idx++);//0~51번방
                Card c = new Card();
                //cards[idx++] = c; //아래에 있을 때와 차이 없다 주소값을 알고 있는 c의 주소값을 복사해서 줌
                //c.shape랑 c.number로 접근가능 //주소값 알려주고 옮기기=옮기고 알려주기
                //객체=주소값만 알면 접근할 수 있는 존재
                c.shape = shapes[k];
                c.number = switch (i) {//"" + k;
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(i);//정수를 문자열로
                };
                cards[idx++] = c;
            }
        }
        System.out.println("-----------");
        for(Card c: cards){
            System.out.printf("%s %s\n",c.shape,c.number);
        }
    }
}
