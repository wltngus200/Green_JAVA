package com.green.day23;
//Value Object=이론적으론 setter가 있음 안됨
// 생성자 통해서 값을 넣을 수 있다

public class BuySelVO {
    private String memId;
    private int buyCount;

    public BuySelVO(String memId, int buyCount){//이름이 클래스랑 같다
        //클래스가 퍼블릭이면 다 퍼블릭
        this.memId=memId;
        this.buyCount=buyCount;
    }

    public String getMemId() {
        return memId;
    }

    public int getBuyCount() {
        return buyCount;
    }

    @Override
    public String toString(){
        return String.format("memId: '%s' buycount=%d",memId,buyCount);
    }
}
