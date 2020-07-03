package com.ctci.strings;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest {
    private Util utils;

    @Before
    public void setup() {
        utils = new Util();
    }


    @Test
    public void replaceSpaces() {
        String input = "Mr John   ";
        utils.replaceSpaces(input.toCharArray(), 7);
    }

    @Test
    public void doesStringContainUniqueChars() {
        String input = "avinash";
        assertThat (utils.doesStringContainUniqueChars(input)).isFalse();

        input = "abc";
        assertThat (utils.doesStringContainUniqueChars(input)).isTrue();

    }
}