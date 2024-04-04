package com.green.day16.ch7;

public class PolyArgumentTest {
    public static void main(String[] args){ //arg=argument 줄임말
        //메소드 안 소괄호 파라미터, 파라미터에 보내는 값 아규먼트(인자, 인수)
        Product p=new Product(1000);//프라이스에 입력. 보너스 입력포인트는 1/10
        Product p2=new Product(500);//프라이스에 입력. 보너스 입력포인트는 1/10
        System.out.printf("price: %d ",p.getPrice());
        System.out.printf("price: %d\n",p.getBonusPoint());
        System.out.println(p);//price: 1000, bonusPoint:100
        //p.toString()을 호출+그를 이용
        System.out.println();//안에 .toString 이 생략되어있다
        System.out.println(p2);
        System.out.println();

        Tv tv=new Tv();
        System.out.println(tv);//product에서 이미 오버라이딩 되어서 에러x
        //TV price :100
        System.out.println();

        Computer com=new Computer();
        System.out.println(com);
        System.out.println();

        Sofa so=new Sofa();
        System.out.println(so);

        System.out.println("------------------------------------");
        System.out.println("------");

        Buyer buyer =new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());//물건을 구매하면 돈은 까이고 포인트는 쌓이게
        System.out.println("------");

        System.out.println();
        buyer.showMeTheMoney();
        System.out.println(buyer.getHaveMoney());//객체의 이름으로 소환
        System.out.println(buyer.getHaveBonusPoint());//객체의 이름으로 소환

    }
}
class Buyer{
    private int haveMoney;
    private int haveBonusPoint;
    Buyer(int haveMoney){
        this.haveMoney=haveMoney;
    }
    void setHaveBonusPoint(int haveBonusPoint){
        this.haveBonusPoint=haveBonusPoint;
    }
    void buy(Product product){
        this.haveMoney-=product.getPrice();
        this.haveBonusPoint+=product.getBonusPoint();
        System.out.printf("%s\n", product);//이거 왜 안뜨지?
    }
    void showMeTheMoney(){
        System.out.printf("haveMoney: %d, haveBonusPoint: %d",haveMoney, haveBonusPoint);
    }
    int getHaveMoney(){
        return this.haveMoney;
    }
    int getHaveBonusPoint(){
        return this.haveBonusPoint;
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    @Override
    public String toString(){//super을 이용하는 방법
        return String.format("TV ")+super.toString();//부모클래스의 메소드 활용
                           //("TV %s",super.toString())
    }
}
class Sofa extends Product{
    Sofa(){
        super(80);
    }
    public String toString(){//super를 이용하는 방법
        return String.format("Sofa %s",super.toString());
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){//getPrice를 이용하는 방법
        return String.format("Computer price: %d, bonusPoint: %d",getPrice(),getBonusPoint());
    }
}
class Product{
    private final int price;
    private final int bonusPoint;

    Product(int price){
        this.price=price;
        this.bonusPoint=price/10;
    }
    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }
    @Override//오버라이딩은 객체 기준 그래서 Product에
    public String toString(){
        return String.format("price: %d, bonusPoint: %d",price, bonusPoint);
    }
}
