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
 * @created 2019-03-22
 */
public class QuickSort {
    public static <T extends Comparable<T>> T[] sort(T[] sourceArray){
        T[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        return quickSort(arr, 0, arr.length - 1);
    }

    private static  <T extends Comparable<T>> T[] quickSort(T[] arr, int l, int r){
        if(l < r) {
            T temp = arr[l];
            int i = l, j = r;
            while (i < j) {
                while (i < j && temp.compareTo(arr[j]) < 1) {
                    j--;
                }
                if (i < j) {
                    arr[i++] = arr[j];
                }
                while (i < j && temp.compareTo(arr[i]) == 1) {
                    i++;
                }
                if (i < j) {
                    arr[j--] = arr[i];
                }
            }
            arr[i] = temp;
            quickSort(arr, l, i - 1);
            quickSort(arr, i + 1, r);
            return arr;
        }else {
            return arr;
        }
    }

    public static void main(String... arg) {
        System.out.println(Arrays.asList(QuickSort.sort(new Integer[]{1, 4, 5, 7, 6, 8, 5, 3})));
    }
}
