package com.green.day18;

public class ExamTest {
    public static void main(String[] args){
        int rVal=Exam.getRandomValue(1,11);//1~10사이의 랜덤값 리턴
        rVal=Exam.getRandomValue(5,21);//5~21 사이의 값 리턴

        //검증
        /*for(int i=0;i<1000;i++){
            rVal=Exam.getRandomValue(1,6);
            System.out.println(rVal);
            if(rVal<1||rVal>5){
                System.out.println("1~5사이가 아님");
                break;
            }
        }*/

        int rVal2=Exam.getRandomValue(1,101);//1~100
        Exam.printOddEven(rVal2);//~는 짝수 ~는 홀수

        int n=0;
        for(int i=100;i<104;i++){//100,99,98,97
            if(i<103){
                System.out.printf("%d, ",i-2*(n++));
            }else{
                System.out.println(i-2*(n++));
                                    //200-i
            }
        }

        System.out.println("----------------------");

        Exam.test(11,3);
        //v1이 짝수:v2도 짝수 v2-v1/v2가 홀수면 v1값만
        //v1이 홀수:v2가 짝수 v2-5/v2가 홀수면 v2값만

        System.out.println("--------------");

        //n1~n2숫자를 세로로 출력
        Exam.printNumToNum(1,2);

        System.out.println("--------------");
        int score=Exam.getRandomValue(-100,200);
        System.out.println("socre: "+score);
        String grade=Exam.getGrade(score);
        System.out.println(grade);

        System.out.println("--------------");
        int sum=Exam.getSumFromTo(8,20);
        System.out.println("sum: "+sum);

    }
}
class Exam{
    int min;
    int max;
    static int getRandomValue(int min, int max){
        int random=(int)(Math.random()*(max-min))+min;
        return random;
    }
    static void printOddEven(int val){
        System.out.printf("%d은(는) %s수입니다\n",val, (val%2!=0?"홀":"짝"));//%c=문자 '홀' '짝'
    }
    static void test(int val1, int val2){
        if(val1%2==0){
            if (val2 % 2 == 0) {
                System.out.println(val2-val1);
            }else{
                System.out.println(val1);
            }
        }else{
            if(val2%2==0){
                System.out.println(val2-5);
            }else{
                System.out.println(val2);
            }//삼항식 쓰면 else안 써도 됨
        }
    }
    static void printNumToNum(int n1, int n2){
        for(int i=n1;i<=n2;i++){
            System.out.println(i);
        }
    }
    static String getGrade(int score) {

        if (score > 100 || score < 0) {return "잘못된 점수입니다";}

        String result;
        String plus;
        if (score < 70) {
            return "F";
        } else if (score == 100) {
            return "A+";
        } else {
            int ten = score / 10;
            int one = score % 10;
            result=switch (ten) {
                case 9 ->  "A";
                case 8 ->  "B";
                default -> "C";
            };
            plus=switch (one) {
                case 0, 1, 2 -> "-";
                case 3, 4, 5 -> "0";
                default -> "+";
            };
        }
        return result + plus;
    }
    static int getSumFromTo(int min, int max){
        int sum=0;
        for(int i=min;i<=max;i++){
            sum+=i;
        }
        return sum;
    }
}