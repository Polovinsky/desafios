package br.com.polovinskycode.appstring.read;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ReadTextTest {

    @Test
    public void read_withThreeWords_shouldReturnArray() throws Exception {
        String text = "Diego Rocha Ramos";
        ReadText read = new ReadText(0, text);
        Assert.assertThat(read.breakWords().length, Matchers.equalTo(3));
    }
}