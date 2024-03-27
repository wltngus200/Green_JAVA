package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args){
        int n1=10,n2=20,n3=30,n4=40,n5=50;
        //여러개의 값을 저장할 때 선언부터 힘듦~ _(:> ,)_
        int[] numArr=new int[10];//한번 만든 배열은 바뀔 수 없다! 줄이고 늘일수 없어 새로 만들고 복사
        //numArr=new int[11]하면 새로 만드는 것, 10칸짜리는 사라져버림(메모리 부족할 때)//주소값 바뀜
        //new라는 키워드=새거를 만든다

        //int[] numArr2={10,20,30,40,50};
        int[] numArr3=new int[] {10,20,30};//메소드에게 값을 다이렉트로 전달
        //마지막처럼 쓰는 경우도 있음 한정적인 경우

        //주소값이 저장되고 주소값을 저장하면 쓸 수 있다.
        //10칸짜리 배열의 주소값을 알고 있어 그 칸을 활용할 수 있다
        //칸마다 타입이 있다
        //길이 이상의 첨자(인덱스)를 사용하면 에러

        //읽고 쓰고 읽고
        System.out.println(n1);
        n1=11; //수정=쓰기
        System.out.println(n1);

        numArr=new int[10];//칸만 만들고 값은 넣지 않았다(초기화X)
        System.out.println("numArr[0]= "+numArr[0]);
        //c언어는 쓰레기값이 있어 갱신마다 이상한 값
        //자바는 디폴트값이 있다 인수형 0으로 채워줌, 불린 배열은 false
        //프라모티브(대문자) 타입은 null이 존재(내가 가리키는 객체의 주소값이 없다!)

        numArr[0]=11;
        System.out.println("numArr[0]= "+numArr[0]);

        int[] numArr2={10,20,30,40,50};//칸도 만들고 초기화도 바로
        System.out.println("numArr2[1]= " + numArr2[1]);//읽기
        numArr2[1]=25;//수정 write
        System.out.print("numArr2[1]= "+numArr2[1]);

        //문자열 여러개 저장 //String arr[]=스트링이 여러개인 배열
        String[] strArr=new String[10];

        String[] strArr2=new String[5];//이콜(=)로 저장되는 값은 1개 //주소값 딱 1개만 저장
        //쟁반 하나가 어디 있는지 앎. 쟁반 위에 핸드폰 올리고, 쟁반 위에 핸드폰 올리고
        //주소값을 알면 접근할 수 있어 값을 읽고 쓰고 가능
        //레퍼런수 변수의 특징인데 우선 여기까지만 이해해
        System.out.println("strArr[0]= "+strArr[0]);
        System.out.println("strArr[1]= "+strArr[1]);
        for(int i=0;i<numArr.length;i++){

        /*
        배열을 사용하는 이유:같은 타입의 여러 값을 '편하게' 저장하기 위해
        배열의 특징: 크기는 고정, 생성하고 난 후에 크기 수정 불가능
                    index사용 (0번부터 사용, 마지막 값은 배열 크기 n-1값)
                    for문과 자주 함께 사용함(for int i=0의 이유)
         */

        }
    }
}
