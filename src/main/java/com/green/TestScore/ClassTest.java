package com.green.TestScore;

public class ClassTest {
    public static void main(String[] args){
        //가입신청서 양식대로 제출

        Club kim=new Club("kim",981225,202405181, "생명과학과");
        Club lee=new Club("lee",940314,202806291, "수학과");
        Club son=new Club("son",880201,201109172,"국어국문학과");
        //class라는 신청서를 쓰고 회원이 된다

        String[] member=new String[3];//이걸 자동적으로 작성 해줬으면
        int today=1225;//오늘 날짜만 자동 생산..
        //회원들이 기입한 생년월일에서 날짜부분만 %로 추출해서 오늘 날짜와 비교
        //오늘과 같으면 생일 축하합니다. 그걸 회원이 1000명이라도 가능하게 for문으로
        System.out.print(kim.partyday());
        //정확하게 이름.메소드를 해야한다. 변수가 안되니 반복을 돌릴 수 없다.
        //kim.partyday해야 생일 날짜만 나옴->그걸 배열이나 뭐나 이런 걸로 차례로 하고 싶음 ㅠ
        //이름을 뽑아내고 싶은데? 이름을 뽑아내려면 이름을 알아야되는 상황 ㅋㅋㅋ
        System.out.print(kim.partyday()==today);
        for(int i=0;i<member.length;i++) {
            if (kim.partyday()==today) {
                //이 부분을 각 멤버 별로 설정해서
                System.out.print("happy birthday!");
            }
        }
        member[1]=new Club("kim",981225,202405181,"생명과학과").toString();
        member[2]=new Club("lee",940314,202806291,"수학과").toString();
        member[3]=new Club("son",880201,201106172,"국어국문학과").toString();
        System.out.print(member[1]);//에러에러~
    }
}
class Club{//멤버 리스트 양식을 별도의 장부에 관리한다고 생각
    private String name;
    private int birthday;
    private long stu_id;
    private String major;

    Club(String name,int birthday, long stu_id, String major) {//가입신청서
        this.name = name;//멤버변수 = 인수 형태
        this.birthday = birthday; //이 란에는 이걸 쓰세요
        this.stu_id = stu_id;
        this.major = major;
    }
    /*

    class는 가입신청서 종이->신청서 속 사람들로 동아리라는 객체를 만듦
    class=동아리 활동계획서??
        멤버변수=신청서 작성 예시
    객체 안에 있는 속성=성비, 연령대, 키, 관심사 등등
    객체 안에 있는 메소드=동아리의 활동

     */

        String getName(){//회원 실적+신상 조회?
        //앞에 적힌 타입이 리턴하는 타입
            return name;
        }
        long getStu_id(){
            return stu_id;
        }
        int getBirthday(){
            return birthday;
        }
        String getMajor(){
            return major;
        }
        int partyday(){
            int party=birthday%10000;
            return party;
        }
}
