package com.leetcode.medium;

public class MediumUtils {

    // default to 0s
    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }
        for (int start = 0; start < strLength - 1; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
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
}
