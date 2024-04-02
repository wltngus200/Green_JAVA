package com.green.day14.ch6;

public class CarTest {//p.294 매개변수 있는 생성자(오버로딩 된 생성자) This
    public static void main(String[] args){
        Car c1=new Car("white","-auto-",5);
        Car c2=new Car("black","manual",3);

        System.out.printf("c1.color: %s, c1.gearType: %s, c1.door: %d\n",c1.color, c1.gearType, c1.door);
        System.out.printf("c2.color: %s, c2.gearType: %s, c2.door: %d\n",c2.color, c2.gearType, c2.door);

        Car c3=new Car();
        System.out.printf("c3.color: %s, c3.gearType: %s, c3.door: %d\n",c3.color, c3.gearType, c3.door);
        //이 위를 손대지 않고 red, manual, 5 로 출력

        Car c4=new Car(c2);
        System.out.printf("c4.color: %s, c4.gearType: %s, c4.door: %d\n",c4.color, c4.gearType, c4.door);
        //black, manual, 3
    }
}
class Car{
    String color;//전역변수
    String gearType;
    int door;
    //생성자의 자동 생성>원하는 위치에 커서를 두고 오른쪽 마우스 Generate
    Car(){
        /*this.color="-red-";
        this.gearType="manual";
        this.door=5;*/
        this("red","auto",5);//this()는 메소드 호출

    }//this.멤버필드, 메소드
    //this(); 생성자
    public Car(String color, String gearType, int door){//매개변수//퍼블릭은 없어도 됨
        this.color=color;//변수 이름이 같을 경우 가장 가까운 값을 사용하게 됨
        //this와 위에 생성된 객체 c1이 같은 주소값 //객체화 된 나 자신의 주소값
        this.gearType=gearType;
        this.door=door;
        init();
    }
    Car(Car c2){
//        color=c2.color;
//        gearType=c2.gearType;
//        door=c2.door;
        this(c2.color,c2.gearType,c2.door);
    }
    void start(){
        System.out.println("차 시동을 건다");
        //this(); 생성자 불가 객체 생성할 때만 사용 메소드 사용시점엔 이미 객체 생성이 끝난 시점
    }
    void init(){//생성자가 길어지면 지저분하다 느껴 메소드를 생성자에 호출하는 경우도 있음

    }

}
