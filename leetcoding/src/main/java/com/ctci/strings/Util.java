package com.ctci.strings;

public class Util {

    public void main(String[] args){}
    public static void main(){}
    private static void start(String[] myData){}
    //public static final void main(String[] myData){}

    /**
     * String contains unique chars, assume ascii 128 chars
     * O(log N) ; O(1)
     */
    boolean doesStringContainUniqueChars(String str) {
        if (str.length() > 128) return false;
        boolean[] strChars = new boolean[128];
        for(int i = 0 ; i < str.length() ; i++) {
            int val = str.charAt(i);
            if (strChars[val]) {
                return false;
            }
            strChars[val] = true;
        }
        return true;
    }

    /**
     * URLify
     */

    void replaceSpaces(char[] str, int trueLength) {
        int i, numSpaces = 0;
        for (i = 0 ; i < trueLength ; i++) {
            if (str[i] == ' ')
                numSpaces++;
        }

        int index = trueLength + numSpaces * 2;
        if (trueLength < str.length) str[trueLength] = '\0'; // indicating end of array
        for (i = trueLength - 1 ; i >=0 ; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '%';
                str[index - 2] = '2';
                str[index - 3] = '0';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        System.out.println("replaced string = "+String.valueOf(str));

    }
}
