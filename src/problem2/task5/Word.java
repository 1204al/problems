package problem2.task5;

import java.util.List;
import java.util.StringJoiner;

public class Word {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word) {

        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
