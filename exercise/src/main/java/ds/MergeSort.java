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
 * @created 2019-03-21
 */
public class MergeSort {
    public static <T extends Comparable<T>> T[] sort(T[] sourceArray){
        //T[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        if(sourceArray.length < 2){
            return sourceArray;
        }
        T[] left = Arrays.copyOfRange(sourceArray, 0, sourceArray.length / 2);
        T[] right = Arrays.copyOfRange(sourceArray, sourceArray.length / 2, sourceArray.length);

        return merege(sort(left), sort(right));
    }

    private static <T extends Comparable<T>> T[] merege(T[] left, T[] right){
        Comparable<T>[] arr = new Comparable[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex + rightIndex < arr.length){
            if (leftIndex == left.length && rightIndex < right.length){
                arr[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            }else if(leftIndex < left.length && rightIndex == right.length){
                arr[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            }else {
                if(left[leftIndex].compareTo(right[rightIndex]) == -1){
                    arr[leftIndex + rightIndex] = left[leftIndex];
                    leftIndex++;
                }else {
                    arr[leftIndex + rightIndex] = right[rightIndex];
                    rightIndex++;
                }
            }
        }
        return (T[])arr;
    }
    public static void main(String... arg) {
        System.out.println(Arrays.asList(MergeSort.sort(new Integer[]{1, 4, 5, 6, 6, 7, 9, 8, 5, 3})));
    }
}
