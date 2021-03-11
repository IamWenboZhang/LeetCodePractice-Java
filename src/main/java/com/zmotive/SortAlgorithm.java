package com.zmotive;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class SortAlgorithm {
    private  static  void Swap(int[]arr, int first,int second){
        var tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
    private static int GetRandomInRange(int start,int end){
        Random random = new Random();
        int s = random.nextInt(end) % (end - start + 1) + start;
        return s;
    }
    public static int[] Shuffle(int[] arr){
        System.out.println("Before Shuffle");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i< arr.length;i++){
            var ranum = GetRandomInRange(i, arr.length-1);
            Swap(arr,i,ranum);
        }
        System.out.println("After Shuffle:");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] BubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length;j++){
                if (arr[j] < arr[i]){
                    Swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    private   static  void QuickSortHelper(int[] arr,int start, int end){
        if (start < end) {
            var pivot = arr[start];
            var left = start;
            var right = end;
            while (left < right) {
                while (left < right && arr[right] > pivot) {
                    right--;
                }
                if (left < right) {
                    Swap(arr, left, right);
                    left++;
                }
                while (left < right && arr[left] < pivot) {
                    left++;
                }
                if (left < right) {
                    Swap(arr, left, right);
                    right--;
                }
            }
            arr[left] = pivot;
            QuickSortHelper(arr, start, left);
            QuickSortHelper(arr, left + 1, end);
        }
    }

    public static int[] QuickSort(int[] arr){
        QuickSortHelper(arr,0, arr.length-1);
        return arr;
    }
    public  static  int[] InsertionSort(int[] arr){
        return null;
    }
    public  static  int[] ShellSort(int[] arr){
        return null;
    }
    public  static  int[] SelectionSort(int[] arr){
        return null;
    }
    public  static  int[] HeapSort(int[] arr){
        return null;
    }

}
