package com.green.TestScore;

public class ClassTest {
    public static void main(String[] args){

    }
}
class Twinkle{
    public String name="";
    public int birthday;
    public String nickname;

    char/*static???*/ Twinkle(String name,int birthday, String nickname) {
        this.name = name;
        this.birthday = birthday;
        this.nickname = nickname;

        char a = name.charAt(1);
        char b = name.charAt(2);
        System.out.print(a+b);
        return a;
    }
        String getName(){
            return name;
        }
        String getNickname(){
            return nickname;
        }
        int getBirthday(){
            return birthday;
        }
}
