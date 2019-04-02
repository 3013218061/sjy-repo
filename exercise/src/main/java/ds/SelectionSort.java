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
 * @created 2019-03-14
 */
public class SelectionSort {
    public static <T extends Comparable<T>> T[] sort(T[] sourceArray) {
        T[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            T temp = arr[0];
            for (int j = 0; j < arr.length - i; j++) {
                if (temp.compareTo(arr[j]) == -1) {
                    k = j;
                    temp = arr[j];
                }
            }
            arr[k] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String... arg) {
        System.out.println(Arrays.asList(SelectionSort.sort(new Integer[]{1, 4, 5, 6, 8, 5, 3})));
    }
}
