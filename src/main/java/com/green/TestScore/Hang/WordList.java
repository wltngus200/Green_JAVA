package com.green.TestScore.Hang;

public class WordList {
    String[] word={"actor", "address", "afternoon", "aggressive",
        "baggage", "basic", "bedroom", "benefit",
        "capacity", "ceremony", "criminal", "consumer",
        "delivery", "development", "diamond", "downtown",
        "embarrassment", "entertainment", "exchange", "exhibition"};
    String[] getWord(){
        return word;
    }
    public static void main(String[] args){
        WordList word=new WordList();//다른 파일의 리스트를 받아오기
        String input_answer=WordList.random(word.getWord());
        char[] answer = input_answer.toCharArray();//문제를 문자열로 전환

        char[] answer_copy = new char[answer.length];
        for (int i = 0; i < answer.length; i++) {//배열을 복사하여 글자 개수만큼 언더바로 표시
            answer_copy[i] = '_';
        }
    }



    static String random(String[] word){
        int num=(int)(Math.random()*21);
        return word[num];
    }
}

