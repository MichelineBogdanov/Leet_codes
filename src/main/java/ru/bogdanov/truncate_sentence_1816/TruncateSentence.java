package ru.bogdanov.truncate_sentence_1816;

import java.util.StringJoiner;

public class TruncateSentence {

    public static void main(String[] args) {

    }

    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        StringJoiner builder = new StringJoiner(" ");
        for (int i = 0; i < k; i++) {
            builder.add(split[i]);
        }
        return builder.toString();
    }

}
