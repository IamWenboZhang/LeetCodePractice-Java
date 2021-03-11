package com.zmotive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmTest {

    @Test
    public void BubbleSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithm.Shuffle(arr4test);
        //var intarr = Arrays.stream(arr4test).mapToInt(Integer::valueOf).toArray();
        var res = SortAlgorithm.BubbleSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }

    @Test
    public void QuickSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithm.Shuffle(arr4test);
        //var intarr = Arrays.stream(arr4test).mapToInt(Integer::valueOf).toArray();
        var res = SortAlgorithm.QuickSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }

    @Test
    public void HeapSortTest(){
        int[] arr4test = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithm.Shuffle(arr4test);
        var res = SortAlgorithm.HeapSort(arr4test);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(expected,res);
    }

}