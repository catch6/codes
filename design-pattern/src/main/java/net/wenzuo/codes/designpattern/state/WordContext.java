package net.wenzuo.codes.designpattern.state;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class WordContext {

    private String words;

    private WordState state;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public WordState getState() {
        return state;
    }

    public void setState(WordState state) {
        this.state = state;
    }

}