/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package ds;

import java.util.Arrays;

/**
 * 在这里编写类的功能描述
 *
 * @author shangjinyu
 * @created 2019-03-19
 */
public class ShellSort {
    public static <T extends Comparable<T>> T[] sort(T[] sourceArray) {
        T[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int gap = arr.length;
        do {
            gap /= 2;
            for (int i = 0; i < gap; i++) {
                for (int j = i; j < arr.length; j += gap) {
                    T temp = arr[j];
                    int k = j - gap;
                    while (k >= 0 && (temp.compareTo(arr[k]) == -1)) {
                            arr[k + gap] = arr[k];
                            k -= gap;
                    }
                    arr[k + gap] = temp;
                }
            }
        } while (gap > 1);
        return arr;
    }
    public static void main(String... arg) {
        System.out.println(Arrays.asList(ShellSort.sort(new Integer[]{1, 4, 5, 6, 8, 5, 3})));
    }
}
