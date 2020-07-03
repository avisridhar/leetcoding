package com.ctci.algos;

public class AlgosUtil {

    /**
     * Bubble Sort O(n^2)
     */

    /**
     * Merge Sort
     */

    /**
     * Quick Sort O(n log n)
     */

    /**
     * DFS
     */

    /**
     * BFS
     */

    /**
     * Binary Search in int array O(log n)
     */
    boolean binarySearchIntArr(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (val < arr[mid]) {
                high = mid - 1;
            } else if (val > arr[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    /**
     * Binary search string array O(log N)
     */
    boolean binarySearchStrArr(String[] str, String val) {
        int low = 0;
        int high = str.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (str[mid].compareTo(val) < 0) {
                high = mid - 1;
            } else if (str[mid].compareTo(val) > 0) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
