package com.green.day23;

public class BuyEntity {//테이블을 개체라고 부름
    private int num;//num은 자동 부여//num은 시도횟수기 때문에 차례대로가 아닐 수도 있다.
    private String memId;
    private String prodName;
    private String groupName;
    private int price;
    private int amount;


    public String getMemId() {
        return memId;
    }

    public String getProdName() {
        return prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }


    public void setMemId(String memId) {
        this.memId = memId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
