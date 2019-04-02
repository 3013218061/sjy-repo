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
 * @created 2019-03-15
 */
public class InsertSort {
    public static <T extends Comparable<T>> T[] sort(T[] sourceArray){
        T[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                while (arr[j].compareTo(arr[j-1]) < 0){
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String... arg) {
        System.out.println(Arrays.asList(InsertSort.sort(new Integer[]{1, 4, 5, 6, 8, 5, 3})));
    }
}
