package test;

public class Main {

    // 예시로 queryBridgeWords 메서드를 작성
    public static String queryBridgeWords(String word1, String word2) {
        StringBuffer str_ = new StringBuffer();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // 여기서는 간단한 예시로 "apple"과 "orange" 사이의 다리 단어를 반환하는 것으로 가정
        if (word1.equals("apple") && word2.equals("orange")) {
            str_.append("bridge_word1 bridge_word2");
        } else {
            str_.append("-1"); // 예외 처리: 다리 단어 없음
        }

        return str_.toString();
    }
}
