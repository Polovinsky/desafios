package br.com.polovinskycode.appstring.read;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ReadTextTest {

    private ReadText readText;

    @Test
    public void read_withThreeWords_shouldReturnArray() throws Exception {
        String text = "Diego Rocha Ramos";
        readText = new ReadText(0, text);
        assertThat(readText.breakWords().length, Matchers.equalTo(3));
    }

    @Test
    public void read_withThreeWords_shouldReturn_xxx() throws Exception {
        String text = "Diego Rocha Ramos";
        readText = new ReadText(0, text);
        assertThat(readText.breakWords().length, Matchers.equalTo(3));
    }
}