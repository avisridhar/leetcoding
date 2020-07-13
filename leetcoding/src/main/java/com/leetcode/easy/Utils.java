package com.leetcode.easy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    /**
     * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
     */

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] splitStr = sentence.split(" ");
        int idx = -1;
        for (int i = 0 ;i < splitStr.length ; i++) {
            idx = splitStr[i].indexOf(searchWord);
            if (idx == 0) {
                return i + 1;
            }
        }

        return idx;

    }


    /**
     * Day of Year
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
    public int dayOfYear(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar();
        try {
            cal.setTime(sdf.parse(date));
        } catch (ParseException pe) {
            return -1;
        }
        return cal.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * Day of Week
     */
    public String dayOfTheWeek(int day, int month, int year) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        return daysOfWeek[cal.get(Calendar.DAY_OF_WEEK)-1];
    }

    /**
     * Factorial
     */
    int fact(int num) {
        return (num == 0 || num == 1) ? 1 : num * fact(num - 1);
    }
    /**
     * Fibonacci
     */
    int fib(int num) {
        int fib = 0;
        if (num == 0) fib+=0;
        else if (num == 1) fib+=1;
        else
        fib = fib(num - 1) + fib(num - 2);
        return fib;
    }

    /**
     * Add Digits of Number
     */
    int addDigits(int num) {
        return (num == 0) ? 0 : num % 9;
    }

    /**
     * Longest substring without repeating characters
     */
    int longestSubstr(String s) {
        int maxLen = 0;
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (strBuild.indexOf(String.valueOf(s.charAt(i))) == -1) {
                strBuild.append(s.charAt(i));
            } else {
                if (strBuild.length() > maxLen) {
                    maxLen = strBuild.length();
                }
                strBuild = new StringBuilder(strBuild.toString().substring(strBuild.indexOf(String.valueOf(s.charAt(i))) + 1));
                strBuild.append(s.charAt(i));
            }
        }

        if (strBuild.length() > maxLen) {
            maxLen = strBuild.length();
        }

        return maxLen;
    }



    /**
     * Reverse Integer
     */
    Integer reverseInteger(Integer num) {
        int signed = 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        if (num < 0) {
            signed = -1;
            stringBuilder.deleteCharAt(0);
        }
        stringBuilder.reverse();

        try {
            return signed * Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException nfe) {
            return 0;
        }

    }

    /**
     * Binary add 2 strings ; result binary string
     */

    /**
     * get the last word's length
     */
    int getLastWordLen(String str) {
        return str.substring(str.lastIndexOf(' ')+1).length();
    }
}
