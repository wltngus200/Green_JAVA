package com.green.day27;

public interface Tv {
    //인터페이스가 많을 수록 유연한 코드, 직접적인 연결보단 간접적 연결 필요
    /*
    직접적인 연결 벽에 연결하는데 콘센트가 아니라 선이 나와 티비와 연결=티비를 교체 할 땐 선을 자르고 피복을 벗겨 다시 연결하는 과정 필요
    콘센트라는 인터페이스를 가지면 다른 티비를 가져와 콘센트를 꽂기만 하면 됨
     */
    void sound();
}
