package com.leetcode.medium;

public class MediumUtils {

    /**
     * Longest palindromic substring
     */
    int longestPalindromeSubstring(String s) {
        if (s.length() == 1) return 1;
        int maxLen = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.length() > 1 && isPalindrome(sb.toString())) {
                if (sb.length() > maxLen) {
                    maxLen = sb.length();
                }
                sb.deleteCharAt(i);
            }
        }
        if (sb.length() > maxLen) {
            maxLen = sb.length();
        }

        return maxLen;

    }

    private boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (str.equals(stringBuilder.reverse().toString()))
            return true;
        else
            return false;
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
