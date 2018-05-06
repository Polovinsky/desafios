package br.com.polovinskycode.appstring.read;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ReadTextTest {

    private ReadText readText;

    @Test
    public void read_withThreeWords_shouldReturnString() throws Exception {
        String text = "Diego Rocha Ramos Lucas";
        readText = new ReadText(11, text);
        String formatted = readText.getTextFormatted();
        assertThat(formatted, Matchers.equalTo("Diego Rocha\nRamos Lucas"));
        assertThat(formatted.length(), Matchers.equalTo(23));
        System.out.println(formatted.toString());
    }
}