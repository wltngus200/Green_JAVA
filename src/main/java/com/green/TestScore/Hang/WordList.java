package com.green.TestScore.Hang;

import java.util.Arrays;

public class WordList {
    static String[] words={"actor", "address", "afternoon", "aggressive",
            "baggage", "basic", "bedroom", "benefit",
            "capacity", "ceremony", "criminal", "consumer",
            "delivery", "development", "diamond", "downtown",
            "embarrassment", "entertainment", "exchange", "exhibition"};
    static String wordchoose(String[] word){
        int idx=(int)(Math.random()*words.length);
        String input_answer=words[idx];
        return input_answer;
    }
    static String input_answer=(wordchoose(words));//메소드 결과를 바로 변수에 대입

}

