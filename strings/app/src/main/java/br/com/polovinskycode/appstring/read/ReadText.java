package br.com.polovinskycode.appstring.read;

public class ReadText {

    private final Integer limitLine;
    private final String text;

    public ReadText(Integer limitLine, String text) {
        this.limitLine = limitLine;
        this.text = text;
    }

    protected String[] breakWords() {
        return text.split(" ");
    }
}
