package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearch {

    private WordSearch() {
    }

    public static final WordSearch INSTANCE = new WordSearch();

    private String findQuestions (String data) {
        String result = "";
        Pattern pattern = Pattern.compile("([^.?!]*\\?)");
        Matcher matcher = pattern.matcher(data);
        while(matcher.find()) {
            result = result.concat(matcher.group());
        }
        return result;
    }

    private Set<String> findWords(int length, String data) {
        String questions = findQuestions(data);
        Set<String> words = new HashSet<>();
        String regex = String.format("(\\b\\w{%d}\\b)", length);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(questions);
        while(matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public void displayWords(int length, String data) {
        Set<String> words = findWords(length, data);
        for (String word : words) {
            System.out.println(word);
        }
    }
}