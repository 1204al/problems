package problem2.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private List<Sentence> sentences = new ArrayList<>();
    private String name="NoName";
    public int size(){
        return sentences.size();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Text(List<Sentence> sentences, String name) {
        this.sentences = sentences;
        this.name = name;
    }

    public Text(String text, String name) {
        this(text);
        this.name = name;
    }
    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public Text(String text) {
        Pattern patternSentence = Pattern.compile("\\.|\\?|\\!");
        Matcher matcher = patternSentence.matcher(text);
        int startIndex = 0;
        while(matcher.find()){
            String sentence=text.substring(startIndex, matcher.start()).trim();
            this.sentences.add(new Sentence(sentence));
            startIndex = matcher.end();
        }


    }

    public void add(Sentence... sentences) {
        for (Sentence sentence : sentences) {
            this.sentences.add(sentence);
        }
    }
    public void add(String otherTextString) {
        Text otherText=new Text(otherTextString);
        sentences.addAll(otherText.getSentences());
    }




    @Override
    public String toString() {
        return sentences + "";
    }
}
