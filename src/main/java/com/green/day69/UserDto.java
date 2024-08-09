package com.green.day69;

public class UserDto {//체이닝 기법 이해
    private int age;
    private String name;
    private String addr;

    //프라이빗한 멤버필드에 외부에서 값 넣기=setter, 생성자 / 가져오기는 getter만 가능
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
