package com.green.day4;

public class MissionGrade {
    public static void main(String[] args){
    //0~100점사이 랜덤값
        int score=(int)(Math.random()*101);
        if(score>100||score<0){
            System.out.println("점수가 잘못 되었습니다.");
        } else {
            String grade="F";
            if(score>=90){grade="A";}
            else if(score>=80) {grade="B";}
            else if(score>=70) {grade="C";}
            //그 외는 다 F기 때문에 else 불필요
            System.out.printf("당신의 점수는 %d, 학점은 %s입니다.\n",score,grade);
            //%s문자열 %d뭐지 %f정수 %b불린
        }

        /*
        System.out.print("당신 학점은 "+score+"점, ");
        if(score>=90){
            System.out.print("A");
        } else if(score>=80) {
            System.out.print("B");
        } else if(score>=70) {
            System.out.print("C");
        } else {
            System.out.print("F");
        }
        System.out.print("입니다.");
        */
    }
}
