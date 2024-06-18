package org.nakul;

import java.util.List;

public class Question {

    private String questiontext;
    private List<String> options;
    private int correctanswerindex;

    public Question(String questiontext, List<String> options, int correctanswerindex) {
        this.questiontext = questiontext;
        this.options = options;
        this.correctanswerindex = correctanswerindex;
    }

    public String getQuestiontext() {
        return questiontext;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectanswerindex() {
        return correctanswerindex;
    }
}
