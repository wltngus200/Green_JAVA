package com.green.day17.ch11;

public class MyArrayListTest {
    public static void main(String[] args){
        MyArrayList list=new MyArrayList();
        list.showLength();
        list.add(10);//arr 기존 크기보다 더 큰 새로운 배열 만들고 /그 배열의 0번칸에 10
        //새로운 배열의 주소값을 전역변수 arr에 대입한다
        list.showLength();
        list.add(11);
        list.showLength();
        list.add(12);
        list.showLength();
        System.out.println(list); // [10,20]

        list.add(13);
        list.add(14);
        list.add(15);
        list.add(15);
        System.out.println(list);
        int size=list.size();//길이가 나오게
        System.out.println("size: "+size);
        System.out.println(list.get(3));//13
        System.out.println(list.get(5));//15
    }

}
class MyArrayList{
    private int[] arr;//int 배열
    //객체화가 되면 0개짜리 배열 생성
    MyArrayList(){//부모가 퍼블릭이면 얘도 퍼블릭
        arr=new int[0]; //this의 차이
    }
    void add(int num){
        int[] tmp=new int[arr.length+1];//1칸 긴 배열을 생성
        tmp[arr.length]=num;//0번칸만 가지는 배열을 만듦=배열길이 1, 1-1=0번방/*arr.length=tmp.length-1*/
        //새 배열 마지막 칸에 num을 넣음
        for(int i=0;i<arr.length;i++){
            tmp[i]=arr[i];
            //새로운 배열에 기존 배열의 같은 인덱스의 값을 대입
        }arr=tmp;//배열에 주소값
    }
    void showLength(){
        System.out.println("len: "+arr.length);
    }
    @Override
    public String toString() {
        /*String.format("[%d",arr[0]);
        for(int i=1;i<arr.length;i++){String.format(", %d",arr[i]);}
        System.out.print("]");
        */
        if (arr.length == 0) {
            return "[ ]";
        }
        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0]));
        for (int i = 1; i < arr.length; i++) {
            sb.append(String.format(", %d", arr[i]));//append 덧붙이기 p.476
        }
        sb.append("]");//반복문을 쓸 때 성능상 유리
        return sb.toString();
    }
        /* 두가지가 같음
        String str2="";
        str2+="안녕";
        str2+="하세요";

        StringBuilder sb2=new StringBuilder();
        sb2.append("안녕");
        sb2.append("하세요");*/

    int size(){
        int size=arr.length;
        return size;
    }

    int get(int i){
        return arr[i];
    }

}
