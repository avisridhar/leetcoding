package com.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class UtilsTest {
    private Utils utils;

    @Before
    public void setup() {
        utils = new Utils();

    }

    @Test
    public void isPrefixOfWord() {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        assertThat(utils.isPrefixOfWord(sentence, searchWord)).isEqualTo(4);

        sentence = "hellohello hellohellohello";
        searchWord = "ell";
        assertThat(utils.isPrefixOfWord(sentence, searchWord)).isEqualTo(4);
    }

    /**
     * Example 1:
     *
     * Input: date = "2019-01-09"
     * Output: 9
     * Explanation: Given date is the 9th day of the year in 2019.
     *
     * Example 2:
     *
     * Input: date = "2019-02-10"
     * Output: 41
     *
     * Example 3:
     *
     * Input: date = "2003-03-01"
     * Output: 60
     *
     * Example 4:
     *
     * Input: date = "2004-03-01"
     * Output: 61
     */
    @Test
    public void dayOfYear() {
        assertThat(utils.dayOfYear("2019-01-09")).isEqualTo(9);
        assertThat(utils.dayOfYear("2019-02-10")).isEqualTo(41);
        assertThat(utils.dayOfYear("2003-03-01")).isEqualTo(60);
        assertThat(utils.dayOfYear("2004-03-01")).isEqualTo(61);

    }

    /**
     * Input: day = 31, month = 8, year = 2019
     * Output: "Saturday"
     *
     * Input: day = 18, month = 7, year = 1999
     * Output: "Sunday"
     *
     * Input: day = 15, month = 8, year = 1993
     * Output: "Sunday"
     */
    @Test
    public void dayOfTheWeek() {
        assertThat(utils.dayOfTheWeek(18, 7, 1999)).isEqualTo("Sunday");
        assertThat(utils.dayOfTheWeek(31, 8, 2019)).isEqualTo("Saturday");
        assertThat(utils.dayOfTheWeek(15, 8, 1993)).isEqualTo("Sunday");
    }

    @Test
    public void fact() {
        assertThat(utils.fact(3)).isEqualTo(6);
    }

    @Test
    public void fib() {
        assertThat(utils.fib(2)).isEqualTo(1);
        assertThat(utils.fib(3)).isEqualTo(2);
        assertThat(utils.fib(4)).isEqualTo(3);
    }

    @Test
    public void addDigits() {
        assertThat(utils.addDigits(38)).isEqualTo(2);
        assertThat(utils.addDigits(52)).isEqualTo(7);
    }

    @Test
    public void longestSubstr() {
        assertThat(utils.longestSubstr("aaa")).isEqualTo(1);
        assertThat(utils.longestSubstr("abcabcbb")).isEqualTo(3);
        assertThat(utils.longestSubstr("dvdf")).isEqualTo(3);
    }

    @Test
    public void reverseInteger() {
        assertEquals(new Integer(321), utils.reverseInteger(123));
        assertEquals(new Integer(-321), utils.reverseInteger(-123));
    }

    @Test
    public void getLastWordLen() {
        assertEquals(7, utils.getLastWordLen("Avinash Sridhar"));
    }

}