package com.green.day23;

public class BuyEntity {//테이블을 개체라고 부름
    /* 17일 추가
    ORM오브젝트 릴레이션십(RDB) 매핑 객체로 연결해준다 -ㄴSelect update delete를 자동으로
    자바에서 orm의 규격을 만든게 jpa(JAVA persistent API)=인터페이스의 모임->그걸 구현 하면 JPA
    프레임워크로 테이블 X 쿼리문 작성 X 테이블마다 Entity (테이블과 1대 1매칭) 값의 길이 pk여부 정도 입력하면 가능
    VO 값 그 자체를 나타냄 =수정불가(setter가 빠짐), 동등성 비교만 해야한다
    dto 데이터가 옮겨질 때 쓰는 객체 쪼개는 이유가 TDD때문(테스트가 용이하게 하기 위해)
    기능별로 컨트롤러와 서비스가 생김 클라이언트-컨트롤러-서비스
    해쉬코드=암호화
    모델링이 중요한 이유=데이터를 어떻게 저장할 것인가를 결정
     */
    private int num;//num은 자동 부여//num은 시도횟수기 때문에 차례대로가 아닐 수도 있다.
    private String memId;
    private String prodName;
    private String groupName;
    private int price;
    private int amount;


    public String getMemId() {
        return memId;
    }

    public String getProdName() {
        return prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }


    public void setMemId(String memId) {
        this.memId = memId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
