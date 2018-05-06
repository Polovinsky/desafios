package br.com.polovinskycode.appstring.read;

import java.util.Scanner;

public class ReadText {

    private static final String SPACE = " ";
    private final Integer limitLine;
    private final String text;

    public ReadText(Integer limitLine, String text) {
        this.limitLine = limitLine;
        this.text = text;
    }

    public String getTextFormatted() {
        StringBuilder text = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(this.text);
        while (scanner.hasNext()) {
            String word = scanner.next();
            if ((builder.length() + word.length()) <= (limitLine)) {
                builder.append(word);
                if (builder.length() + word.length() <= (limitLine)) builder.append(SPACE);

            } else {
                text.append(builder).append("\n");
                builder = new StringBuilder();
                builder.append(word).append(SPACE);
            }
        }

        if (builder.length() > 0) text.append(builder);
        return text.toString();
    }
}
