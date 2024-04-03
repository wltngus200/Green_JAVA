package com.green.day15;

public class DeckTest {
    public static void main(String[] args){//14일차의 연장선
        Card c=new Card();

        /*
        String str=c.toString();
        System.out.println(str);
        System.out.println(c);
        System.out.println(c.toString());//객체는 무조건 toString을 가짐
        오버라이딩 확인용
        */


        c.kind="Spade";
        c.number="A";
        //System.out.printf("kind: %s, number:%s\n",c.kind,c.number);
        //System.out.println(c);//카드타입의 변수에 들어있는 것은 카드 객체의 주소값
        //System.out.println(object x) object 최상위 객체 무엇이든 담을 수 있다.
        //주소값을 문자열로 호출 c=>c.toString()
        System.out.println("----------");

        //카드의 주소값이 이동 이동 후에는 null로 처리가 되어야하나 우선 그냥 처리
        Deck deck=new Deck();
        //deck.printAllCard();
        Card c2=deck.pick();
        System.out.println("c2: "+c2);

        Card c3=deck.pick(5);
        System.out.println("c3: "+c3);

        deck.shuffle();
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
               //c.kind=kind[i];//c에 주소값을 담음
               String num=switch(s){
                   case 1 -> "A";
                   case 11 -> "J";
                   case 12 -> "Q";
                   case 13 -> "K";
                   default -> String.valueOf(s);//숫자를 문자열로 바꿈
               };Card c=new Card(kind[i],num);//객체생성
               cards[idx++]=c;//이 과정을 거치지 않으면 다 날아버림
            }
        }

        }
    Card pick(){
        int rIdx=(int)(Math.random()* cards.length);//리터럴 값을 쓰는 것을 최대한 지양
        Card c2=cards[rIdx];
        return c2;//값을 주었지만 여전히 가지고 있다 null로 바꾸는 작업이 필요하지만 현재 시점에선 생략
    }
    Card pick(int num){
        Card card=cards[num];
        return card;
    }
    /*
    final int CARD_NUM;
    Card[] cards;

    Deck(){//생성자
        CARD_NUM=52;
        cards=new Card[CARD_NUM];
     */
    //덱을 만드는 메소드 그걸 생성자에

    void shuffle(){
        Card tmp;
        for(int i=0;i<cards.length;i++){
            int num=(int)(Math.random()*cards.length);
            tmp=cards[i];
            cards[i]=cards[num];
            cards[num]=tmp;
        }
    }

    void printAllCard(){
        for(Card c:cards){
            System.out.println(c);
      }
    }

}
class Card extends Object{//오브젝트 상속은 쓰지 않아도 자동으로 들어감
    String kind;//무늬
    String number;//숫자
    Card(){

    }
    Card(String kind, String number){//생성자
        this.kind=kind;
        this.number=number;
        //DeckTest, Card 클래스 수정 불가
        //나머지는 수정 가능.
        //현재 결과와 똑같이 나오게 해주세요. (에러 제거)
    }

    @Override//없어도 됨//진짜 오버라이딩을 했는지 확인용
    public String toString(){
        return String.format("%s(%s)",kind, number);
    }
}