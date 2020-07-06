package com.leetcode.medium;

public class MediumUtils {

    /**
     * We can find palindromes around center index and
     * span our search both ways, to the right and left of the center.
     * Given that and knowing there's no palindrome on the corners of the input,
     * we can set the boundaries to 1 and length - 1. While paying attention to
     * minimum and maximum boundaries of the String, we verify if the characters
     * at the positions of the symmetrical indexes (left and right) are same
     * for each central position till we reach our max upper bound center.
     *
     * Outer loop is O(N) (max n-2 iterations)
     * Inner while loop is O(N) (max around (n/2)-1 iterations)
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        if (s.length() < 2)
            return s;
        int rightIdx, leftIdxIdx;
        String currentPalindrome;
        String longestPalindrome = "";
        for (int centerIdx = 1 ; centerIdx<s.length() - 1 ; centerIdx++) {
            leftIdxIdx = centerIdx - 1;
            rightIdx = centerIdx + 1;
            while (leftIdxIdx >= 0 && rightIdx < s.length()) {
                if (s.charAt(leftIdxIdx) != s.charAt(rightIdx)) {
                    break;
                }
                currentPalindrome = s.substring(leftIdxIdx, rightIdx + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                leftIdxIdx--;
                rightIdx--;
            }
        }
        return longestPalindrome;
    }

    /**
     * Longest palindrome
     */

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
