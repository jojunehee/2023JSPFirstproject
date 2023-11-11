package com.example.jspcrud;

public class Word {
    public Word(String word, String meaning, int level) {
        this.word = word;
        this.meaning = meaning;
        this.level = level;
    }

    public Word(int id) {
        this.id = id;
    }

    private int id;
    private String word;
    private String meaning;
    private int level;
    private String regdate;
}
