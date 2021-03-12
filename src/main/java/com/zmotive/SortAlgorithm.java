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

    private static void heapy(int[] arr,int parent, int len){
        var left = parent*2+1;
        var right = parent*2+2;
        var max = parent;
        if(parent < len) {
            if (left < len && arr[left] > arr[max]) {
                max = left;
            }
            if (right < len && arr[right] > arr[max]) {
                max = right;
            }
            if (max != parent) {
                SortAlgorithm.Swap(arr, parent, max);
                heapy(arr, max, len);
            }
        }
    }
    private   static  int[] buildHeap(int[] arr,int len){
        var lastparent = (arr.length-2)/2;
        for(int i = lastparent;i>=0;i--){
            heapy(arr,i,len);
        }
        return arr;
    }
    public static int[] HeapSort(int[] arr){
        buildHeap(arr, arr.length);
        for(int i = arr.length-1;i>=0;i--){
            SortAlgorithm.Swap(arr,0,i);
            heapy(arr,0,i);
        }
        return arr;
    }

    public  static  int[] InsertionSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            var preindex = i-1;
            var current = arr[i];
            while(preindex >= 0 && arr[preindex]>current){
                arr[preindex + 1] = arr[preindex];
                preindex--;
            }
            arr[preindex+1] = current;
        }
        return arr;
    }
    public  static  int[] ShellSort(int[] arr){
        return null;
    }

    public  static  int[] SelectionSort(int[] arr){
        for(int i = 0;i< arr.length - 1;i++){
            var minindex = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            System.out.println("Min index: "+minindex+" Min value: "+arr[minindex]);
            Swap(arr,minindex,i);
        }
        return arr;
    }
}
