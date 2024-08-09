package com.green.day69;

public class UserDtoTest {
    public static void main(String[] args){
        UserDto dto=new UserDto();
        //홍길동 20살
        dto.setAge(20);
        dto.setName("홍길동");
        dto.setAddr("서울");

        UserChainingDto dto2=new UserChainingDto();
        dto2.setAge(20).setName("홍길동").setAddr("서울");
        //setter는 void라서 .을 사용 X .이 사용 가능한 경우는 주소값이 있을 때

        UserChainingDto dd=dto2.setAge(21).setName("유관순").setAddr("대구");
        //setAddr(마지막 메소드)의 리턴 값에 따라 타입이 정해짐 -> 앞에서 순서대로 실행
        //메소드 뒤에 .이 붙는 것은 참조변수 값을 리턴하기 때문

        System.out.println(dto);
        System.out.println(dto2);

    }
}
