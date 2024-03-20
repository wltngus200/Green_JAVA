package com.green.practice;

public class MissionRepeat02 {
    public static void main(String[] args){
        //2. 반복으로 구구단표 완성하기

        //n단을 위해 1~9까지의 수가 필요
        for(int n=1;n<10;n++){
            //뒤에 곱할 수도 1~9까지가 필요
            //부등호는 두가지 가능(초과와 이상)
            for(int m=1;m<=9;m++){
                //안의 for는 1X1=1을 넣는 가로
                System.out.print(n+" x "+m+"="+m*n);
                System.out.println();//★여기도 개행이 필요
                //문자열 결합기호(+)를 사용해 식과 함께 결과 출력
            }System.out.println();
            //다음 행에 뜰 수 있게 개행 기호를 넣었다
        }System.out.println();
        //각 단마다 한 줄씩 여백을 넣었다

        //fall01 각 단에 개행이 되는게 아니라 일직선으로 출력됨
                /* ex.1 x 1=11 x 2=21 x 3=31 x 4=4...

            그 때의 풀이 순서
                    1)n단을 위해 1~9까지의 수가 필요
                    2)뒤에 곱할 수도 1~9까지가 필요
                    3)부등호는 두가지 가능(초과와 이상)
                    4)안의 for는 1X1=1을 넣는 가로
                    5)문자열 결합기호(+)를 사용해 식과 함께 결과 출력
                    6)다음 행에 뜰 수 있게 개행 기호를 넣었다
                    7)각 단마다 한 줄씩 여백을 넣었다

            해결방안
              *각 단이 나오는 (n+" x "+m+"="+m*n) 밑에도 개행 추가
                    ->print 함수를 쓰면 for문 스코프를 벗어날 때까지 엔터는 없다
                */

    }
}
