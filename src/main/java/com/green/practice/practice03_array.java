package com.green.practice;

import java.util.Scanner;

public class practice03_array {
    public static void main(String[] args) {//배열 여러개의 값을 한꺼번에 처리하기 위해 필요
        Scanner scan = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요.:");
        int stu = scan.nextInt();
        int[] ban = new int[stu];
        for(int i=0;i<ban.length;i++){
            System.out.print((i+1)+"번 학생의 점수를 입력하세요.");
            int sco=scan.nextInt();
            ban[i]=sco;
        }
        System.out.println("점수입력이 끝났습니다.");
        System.out.println();

        int sum=0;
        for(int k=0;k< ban.length;k++){
            sum+=ban[k];
        }
        System.out.println("합계는" +sum+ "점입니다.");
        System.out.println("평균은" + (double) sum/ban.length +"점입니다.");//실수 doubble
        System.out.println();
        System.out.println();

        for(int s=0;s<ban.length;s++){
            System.out.println("a["+(s+1)+"]="+ban[s]);
        }


        /*int[] a=new int[5];//5개 0,1,2,3,4
        a[1]=37;
        a[2]=51;
        a[4]=a[1]*2;

        System.out.println("a["+0+"]="+a[0]);//초기값
        System.out.println("a["+1+"]="+a[1]);
        System.out.println("a["+2+"]="+a[2]);
        System.out.println("a["+3+"]="+a[3]);//초기값
        System.out.println("a["+4+"]="+a[4]);

        for(int i=0; i<5; i++){
            System.out.println("a["+i+"]="+a[i]);} //위에 거 한번에
        */

        /*
        int[] arw = new int[5];

        for (int i = 0; i < arw.length; i++) {
            System.out.print("비어서 그런가. 진짜네");
            //4강 9분 언저리~

        }
        */

        //배열을 직접 입력하는 법이 뭐더라

        int[] java={10,9,8,7,6,5};
        System.out.println(java.length);
        for(int i=0;i<java.length;i++){
            System.out.println((i+1)+"번"+java[i]);
        }


    }
}
