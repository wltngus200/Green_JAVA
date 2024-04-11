package com.green.day19.blackjack;

public class Card {
    private String pattern;//무늬 //private에 값넣기 setter,생성자
    private String denomination;//숫자 //게터만 있어 파이널이 있어도 상관 없음
    public Card(String pattern,String denomination){//클래스가 퍼블릭이면 생성자도 퍼블릭으로
        this.pattern=pattern;
        this.denomination=denomination;
    }
    public String getPattern(){
        return pattern;
    }
    public String getDenomination(){
        return denomination;
    }//한 번 값이 입력되면 수정할 수 없다 (이뮤터블?)

    @Override
    public String toString() {//String을 반환하는 toString()
        return String.format("%s(%s)",pattern,denomination);//객체를 문자열로 표현
        //String str="반가워"+c를 하면 toString을 자동 호출
    }
    public int getPoint(){
        int score=switch(this.denomination){
            case "A"-> 1;
            case "10,","J","Q","K"-> 10;
            default -> Integer.parseInt(denomination);
        }; return score;
    }
}
class CardTest{
    public static void main(String[] args){
        Card c=new Card("Spade","K");//기본생성자는 없어야 함
        //생성과 동시에 초기화 //생성 당시 1회만 사용가능
        String pattern=c.getPattern();
        String denomination=c.getDenomination();
        System.out.println(c);//Spade(A)
        //println은 콘솔에 문자열을 찍고싶은데 c는 객체, c.toString()는 주소값을 가져옴
        //객체가 들어오면 toString을 이용해 문자열을 달라고 요구
        //println()에 String은 따로 있어서 예외

        int score=c.getPoint();//c가 가진 denomination을 정수값으로 반환
        System.out.println(score);
    }
}

