package com.green.TestScore.Shopping;

import java.util.Scanner;

public class ShopABC {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        Banana honeybanana=new Banana("honey banana","frba-040801",5000,100);
        Banana greenbanana=new Banana("green banana", "frba-040802", 4500, 70);
        Apple goldenapple=new Apple("golden apple","frap-040801", 3000, 50);
        Apple sunsetapple=new Apple("sunset apple","frap-040802", 2500, 50);
        Radish peaceradish=new Radish("peace radish","bgra-040801",1000, 150);
        Radish freshradish=new Radish("fresh radish", "bgra-040802",1500,120);
        Carrot juicecarrot=new Carrot("juice carrot", "bgca-040801",1500, 200);
        Carrot organiccarrot=new Carrot("fresh carrot","bgca-040802",2000, 150);

        System.out.println("검색어를 입력하세요");
        String search=scan.nextLine();
    }
}
