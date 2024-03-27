package com.green.day9.ch5;

public class MissionArray1 {
    public static void main(String[] args){
        //1번 문제
        int[] numArr={10,20,30,40};//내가 넣은 수만큼 방+초기화까지 완료
        //for문 활용 10,20,30,40나오게
        for(int i=0;i<numArr.length;i++){
            System.out.printf("%d, ",numArr[i]);
        }

        System.out.println("\n------------------");

        //2번 문제 --1번문제에서 콤마가 안 찍히게끔
        int i=0;
        for(i=0;i<numArr.length;i++) {
            if (i == 0) {
                System.out.print("");
            } else {
                System.out.print(", ");
            }System.out.printf("%d",numArr[i]);
            //3번 풀이 인데~ i가 0보다 컸을 때만 콤마 찍겠다
        }

            //1번 풀이 0~길이만큼 반복 if i가 (길이-1)이면 i번째 출력 컨티뉴 나머지는 %d,형식으로 출력
            System.out.println("\n==================");

            for(int j=0;j<numArr.length;j++){
                if(j==numArr.length){
                    System.out.print(numArr[j]);
                    continue;
                }System.out.printf("%d, ",numArr[j]);
            }

            //2번 풀이 숫자 따로 콤마따로 콤마만 length-1(이 경우엔 -1한 값을 변수로 지정해서 괄호 안에
            //4번 풀이 숫자 1개를 그냥 출력하고 콤마찍고 숫자 출력의 반복->빈 배열에 시도하면 에러
    }
}
