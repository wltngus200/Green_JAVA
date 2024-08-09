package com.green.day69;

public class UserChainingDto {//체이닝 기법 이해
    private int age;
    private String name;
    private String addr;

    public String getAddr() {
        return addr;
    }

    public UserChainingDto setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    //프라이빗한 멤버필드에 외부에서 값 넣기=setter, 생성자 / 가져오기는 getter만 가능

    public int getAge() {
        return age;
    }

    public UserChainingDto setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserChainingDto setName(String name) {
        this.name = name;
        return this;
    }

    //setter는 void이기 때문에 뒤에 .을 적을 수 없다 .을 적을 수 있다는 건 앞이 주소값이 있다

}
