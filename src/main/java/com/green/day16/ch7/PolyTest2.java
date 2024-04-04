package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args){
        Dog dog=new Dog();
        BullDog bullDog=new BullDog();
        Cat cat=new Cat();

        //void 타입, static, 파라미터 1개, 메소드 위치는 이 클래스, 메소드명
        doCrying(dog);
        doCrying(bullDog);
        doCrying(cat);
        //crying 이라는 메소드만 호출하면 됨
    }
    /*
    Animal ani1=new Dog();
    Animal ani2=new BullDog();
    Animal ani3=new Cat();
    과 같은 표기가 가능하다
    즉 아래 메소드의 파라미터에 dog, bullDog, cat을 담을 수 있다
     */
    static void doCrying(Animal animal){
        animal.crying();
        if(animal instanceof Dog){//만약 animal을 dog로 형변환이 가능하다면
            Dog dog=(Dog)animal;//Dog타입의 dog에 Dog타입으로 강제형변환을 한 animal을 넣어라
            //새로운 변수..?
            dog.sleep();//그 dog의 메소드를 실행시켜라

        //새로운 기능
        /*if(animal instanceof Dog dog2){
            dog2.sleep();
        }
        */

        }
        System.out.println("----------");
    }
}
