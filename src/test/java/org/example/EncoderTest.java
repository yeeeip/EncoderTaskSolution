package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncoderTest {

    @Test
    public void whenGivenNormalStringReturnEncoded() {

        // given
        String inputStr = "1234567890";
        String expectedStr = "5432109876";

        // when
        String result = Encoder.encode(inputStr);

        //then
        assertEquals(expectedStr, result);
    }

    @Test
    public void whenGivenShortStringReturnEncoded() {

        // given
        String inputStr = "123";
        String expectedStr = "321";

        // when
        String result = Encoder.encode(inputStr);

        //then
        assertEquals(expectedStr, result);
    }

    @Test
    public void whenGivenNullStringReturnEmptyString() {

        // given
        String inputStr = null;
        String expectedStr = "";

        // when
        String result = Encoder.encode(inputStr);

        //then
        assertEquals(expectedStr, result);
    }
}
