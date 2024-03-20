package com.green.day5;

public class MissionGradeVer2 {
    public static void main(String[] args){
        //수학이 발목을 잡아요ㅠ
        int score=(int)(Math.random()*131)-10;//-10~120의 랜덤값
        //0~100사이 값이아니면 "점수가 잘못 되었습니다"
        //10의 자리 ~9 A 8=b 7=c... 6 F
        //1의 자리 0~2 - 3~6 0 7~9+

        int val1=score/10;
        int val2=score%10; //노드 나머지

        if(score>100||score<0){
            System.out.println("올바른 점수가 아닙니다.");
            System.out.print("입력된 점수는 "+score);
        } else if (score>=70) {
            String grade="A";
            String plus="+";
            switch (val1) {
                case 10:
                case 9://화살표 쓰고 싶으면 콜론 없이
                    break;
                case 8:
                    grade = "B";
                    break;
                default:
                    grade = "C";
                    break;
            }
            switch(val2){//범위는 if가 나음
                case 0:
                case 1:
                case 2:
                    plus="-";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    plus="0";
                    break;
                default:
                    break;
            }
            System.out.print("당신은 "+ score + "점으로 학점은 ");
            //이 부분이 중복인데 줄일 방법은 없나?
            System.out.print(grade+plus);
        } else {
            System.out.print("당신은 "+ score + "점으로 학점은 ");
            System.out.print("F");
        }
        System.out.println("입니다.");
    }
}
