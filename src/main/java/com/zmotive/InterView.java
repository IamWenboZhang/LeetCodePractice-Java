package com.zmotive;

import java.util.Arrays;
import java.util.Random;

public class InterView {

    private static void Swap(int[]arr,int firstIndex,int secondIndex)
    {
        var tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }

    //QuickSort
    private static  void QuickSortHelper(int[]arr,int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        var pivot = arr[start];
        var left = start;
        var right = end;
        while(left < right)
        {
            while(left < right && arr[right] > pivot)
            {
                right--;
            }
            if(left < right)
            {
                Swap(arr,left,right);
                left++;
            }
            while (left<right && arr[left] < pivot)
            {
                left++;
            }
            if(left<right)
            {
                Swap(arr,left,right);
                right--;
            }
        }
        arr[left] = pivot;
        QuickSortHelper(arr,start,left-1);
        QuickSortHelper(arr,left+1,end);
    }

    public static void QuickSort(int[] arr)
    {
        QuickSortHelper(arr,0,arr.length-1);
    }


    //TopK
    //Heapy array
    private static void Heapy(int[]arr,int parentIndex,int heapSize)
    {
        var leftIndex = parentIndex*2+1;
        var rightIndex = parentIndex*2+2;
        var minIndex = parentIndex;
        if(leftIndex<heapSize && arr[leftIndex] < arr[minIndex])
        {
            minIndex = leftIndex;
        }
        if(rightIndex < heapSize && arr[rightIndex] < arr[minIndex])
        {
            minIndex = rightIndex;
        }
        if(minIndex != parentIndex)
        {
            Swap(arr, parentIndex, minIndex);
            Heapy(arr,minIndex,heapSize);
        }
    }

    //Build Heap, heap size is K
    private static int[] BuildHeap(int[]arr,int heapSize)
    {
        var lastParentIndex = (arr.length-2)/2;
        for(int j = lastParentIndex; j >= 0; j--)
        {
            Heapy(arr,j,heapSize);
        }
        int[] heap = new int[heapSize];
        System.arraycopy(arr,0,heap,0,heapSize);
        return heap;
    }
    //Get TopK
    public static int[] TopK(int[] arr, int K)
    {
        var heap = BuildHeap(arr,K);
        for(int i = K;i<arr.length;i++)
        {
            if(arr[i] > heap[0])
            {
                heap[0] = arr[i];
                Heapy(heap,0,K);
            }
        }
        return heap;
    }


    //Binary Search
    //According left and right calculate the middle value
    //Compare middle value and expected value
    //According compare result update left value and right value until find expected value or left >= right
    public static int BinarySearch(int[] arr,int expected)
    {
        int leftIndex = 0;
        int rightIndex = arr.length-1;
        while (leftIndex < rightIndex)
        {
            var middleIndex = (rightIndex-leftIndex)/2+leftIndex;
            if(expected<arr[middleIndex])
            {
                rightIndex =  middleIndex-1;
            }
            else if(expected > arr[middleIndex])
            {
                leftIndex = middleIndex+1;
            }
            else {
                return middleIndex;
            }
        }
        if(leftIndex == rightIndex && arr[leftIndex]==expected)
        {
            return leftIndex;
        }
        return -1;
    }

    //Shuffle
    //According array length get a random index, then swap current index value with the value of random index
    //After swap change random index range,then do same thing as before, until range == 0
    public static void Shuffle(int[] arr)
    {
        for (int i = 0;i<arr.length;i++)
        {
            int rdIndex = GetRandomInRange(i, arr.length-1);
            Swap(arr,i,rdIndex);
        }
    }
    private static int GetRandomInRange(int start,int end){
        Random random = new Random();
        int s = random.nextInt(end) % (end - start + 1) + start;
        return s;
    }

    //Permutation

    //BST

    //BucketSort


}
