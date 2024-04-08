package com.green.TestScore.Shopping;

public class StoreABC {
}
abstract class fruit {
    String name;
    String code;
    int price;
    int pound;

    public String toString() {
        String infor = String.format("name: %s\nprice: %d\npound: %d", name, price, pound);
        return infor;
    }
}
abstract class vegetable{
    String name;
    String code;
    int price;
    int pound;
    public String toString() {
        String infor = String.format("name: %s\nprice: %d\npound: %d", name, price, pound);
        return infor;
    }
}
class Apple extends fruit{
    Apple(String name, String code, int price, int pound){
        this.name=name;
        this.code=code;
        this.price=price;
        this.pound=pound;
    }
}

class Banana extends fruit{
    Banana(String name, String code, int price, int pound){
        this.name=name;
        this.code=code;
        this.price=price;
        this.pound=pound;
    }
}
class Carrot extends vegetable{
    Carrot(String name,String code, int price, int pound){
        this.name=name;
        this.code=code;
        this.price=price;
        this.pound=pound;
    }
}
class Radish extends vegetable{
    Radish(String name, String code, int price, int pound){
        this.name=name;
        this.code=code;
        this.price=price;
        this.pound=pound;
    }
}