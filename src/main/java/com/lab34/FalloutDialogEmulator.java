package com.lab34;

import java.util.*;
import java.util.stream.Collectors;

public class FalloutDialogEmulator {

    /**
     * популярные русские предлоги
     */
    private final ArrayList<String> prepositions = new ArrayList<>(
            Arrays.asList(
                    "без",
                    "близ",
                    "в",
                    "вместо",
                    "вне",
                    "для",
                    "до",
                    "за",
                    "из",
                    "из-за",
                    "из-под",
                    "к",
                    "кроме",
                    "между",
                    "на",
                    "над",
                    "о",
                    "от",
                    "перед",
                    "пo",
                    "под",
                    "при",
                    "про",
                    "ради",
                    "с",
                    "сквозь",
                    "среди",
                    "у",
                    "через",
                    "ли"
            )
    );

    /**
     * Заканчивается ли строка на знак вопроса
     */
    public boolean isQuestion(String question) {
        return question.indexOf('?') == question.length() - 1;
    }

    public String getAnswer(String question) {
        var questionData = question.substring(0, question.length() - 1); // remove "?"
        List<String> words = new ArrayList<>(Arrays.asList(questionData.split(" ")));

        List<String> result = words.stream()
                .distinct()
                .filter(x -> !this.prepositions.contains(x))
                .collect(Collectors.toList());

        Random rand = new Random();

        return result.get(rand.nextInt(result.size())) + '?';
    }
}
