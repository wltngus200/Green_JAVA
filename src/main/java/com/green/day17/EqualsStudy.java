package com.green.day17;

public class EqualsStudy {
    public static void main(String[] args) {
        NumBox n1=new NumBox(10);
        NumBox n2=new NumBox(10);
        String str=new String("10");
        System.out.println(n1==n2);//레퍼런스타입끼리의 ==비교는 주소값 비교, 같은 객체를 가리키고 있냐 //하지만 동등
        System.out.println(n1.equals(n2));//String은 true인데 정수는 false가 나오는 이유
        System.out.println(n1.equals(str));
        //equals는 오브젝트로부터 상속 받음 String은 값인데 int는 값이 아니다?
        //원래 equals는 주소값 비교 String은 오버라이딩 된 상태.
    }
}
class NumBox{
    private int num;
    NumBox(int num){
        this.num=num;
    }
    @Override
    //Animal ani      =  new Dog();
    //   부모         =    자식      -> 부모는 자식객체의 주소값을 담을 수 있다.
    public boolean equals(Object obj){//오브젝트의 것을 오버라이딩 하기 위해 우선 오브젝트의 값을 그대로 받아온다.
        //들어온 객체가 넘박스인지인지 알아야
        if(!(obj instanceof NumBox)) {//넘박스가 넘어온 게 아니면 비교할 가치X
        //obj에 담긴 주소값이 NumBox로 형변환이 가능해? //if(조건식)이 true일 경우 {실행부}를 실행한다!
        //형변환이 안된다(!(f))=t / 형변환이 된다(!(t))=f 형변환이 안 되는 경우 아래의 실행부를 실행
            return false;//num변환을 하지도 못하면 아예 다른 객체! 돌려보냄.
        }NumBox numbox=(NumBox)obj;//지역변수로 numbox라는 객체를 생성(스코프를 벗어나면 죽음) 후 받은 객체 주소값 넣음
        return this.num==numbox.num;//n1 객체에서 equals이라는 메소드를 불러냈다. this는 지금 자신 즉 n1을 가리킨다.
        //지금 이 메소드를 소환한 객체가 가진 num값과 파라미터로 받아온 obj의 주소값을 담은 numbox의 num값이 같냐?!

        //n1의 타입은 NumBox에 작성했으니 지금 NumBox 클래스에 작성중인 것!

    }
}