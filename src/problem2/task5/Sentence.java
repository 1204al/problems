package problem2.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private List<Word> words=new ArrayList<>();
    public Sentence(List<Word> words) {
        this.words = words;
    }

    public Sentence(String sentence) {
        Pattern patterSentenceElement = Pattern.compile("(\\, )| |\\,");
        Matcher matcher=patterSentenceElement.matcher(sentence);

        int startIndex = 0;
        while (matcher.find()){
            String word=sentence.substring(startIndex,matcher.start()).trim();
            words.add(new Word(word));
            startIndex=matcher.start();
        }
        String word=sentence.substring(startIndex).trim();
    }

    @Override
    public String toString() {
        return words+"";
    }
}
