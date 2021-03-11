package com.zmotive;

public class SearchAlgorithms {
    public static int BinarySearch(int[] arr,int expected){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            var middle = (right-left)/2+left;
            System.out.println("Left: "+left+" Right: "+right+" Middle: "+middle);
            if (arr[middle] == expected){
                return middle;
            }
            else if(arr[middle] < expected){
                left = middle+1;
            }
            else if(arr[middle] > expected){
                right = middle-1;
            }
        }
        return -1;
    }
}
