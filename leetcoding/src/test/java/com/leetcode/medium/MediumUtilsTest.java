package com.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MediumUtilsTest {
    private MediumUtils mediumUtils;

    @Before
    public void setUp() {
        mediumUtils = new MediumUtils();
    }

    @Test
    public void longestPalindrome1() {
        /*assertThat(mediumUtils.longestPalindrome1("bananas")).isEqualTo("anana");
        assertThat(mediumUtils.longestPalindrome1("bananas").length()).isEqualTo(5);*/

        assertThat(mediumUtils.longestPalindrome1("1221")).isEqualTo("1221");
        assertThat(mediumUtils.longestPalindrome1("1221").length()).isEqualTo(4);

    }

    @Test
    public void longestPalindromeSubstring() {
        assertThat(mediumUtils.longestPalindrome("bananas")).isEqualTo("anana");
        assertThat(mediumUtils.longestPalindrome("bananas").length()).isEqualTo(5);

        assertThat(mediumUtils.longestPalindrome("abc")).isEqualTo("121");
        assertThat(mediumUtils.longestPalindrome("abc").length()).isEqualTo(3);
    }
}