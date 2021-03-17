package com.zmotive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SortAlgorithmsTest {

    @Test
    public void BubbleSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.Shuffle(arr4test);
        var res = SortAlgorithms.BubbleSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }

    @Test
    public void QuickSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.Shuffle(arr4test);
        var res = SortAlgorithms.QuickSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }

    @Test
    public void HeapSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.Shuffle(arr4test);
        var res = SortAlgorithms.HeapSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }

    @Test
    public void SelectionSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.Shuffle(arr4test);
        var res = SortAlgorithms.SelectionSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }

    @Test
    public void InsertionSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.Shuffle(arr4test);
        var res = SortAlgorithms.InsertionSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }
}