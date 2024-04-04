package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args){
        BullDog bullDog=new BullDog();

        boolean r=bullDog instanceof Dog;//2에서 if문에 활용
                //참조변수           클래스
        //true: 변수에 든 객체가 클래스로 형변환 가능한가
        System.out.println("r: " +r);

        Animal ani = new Animal();
        System.out.println("ani instanceof Dog: "+(ani instanceof Dog));
                         //부모            자식
        //Dog dog=(Dog)new animal X
        //자식 타입은 부모객체 주소값 담을 수 없다.

        ani = new BullDog();
        System.out.println("ani instanceof Dog: "+(ani instanceof Dog));
                    //ani인척 불독(자식)     부모
        //Dog dog=new BullDog(); O
        //부모타입은 자식객체 주소값 담을 수 있다.

    }
}
