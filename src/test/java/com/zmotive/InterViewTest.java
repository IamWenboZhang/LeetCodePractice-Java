package com.zmotive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class InterViewTest {

    @Test
    public void QuickSortTest()
    {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.Shuffle(arr);
        System.out.println("Before Sort:");
        System.out.println(Arrays.toString(arr));
        InterView.QuickSort(arr);
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(arr));
        Assertions.assertArrayEquals(expected,arr);
    }

    @Test
    public void TopKTest()
    {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        SortAlgorithms.Shuffle(arr);
        var heap = InterView.TopK(arr,4);
        System.out.println("TopK: ");
        System.out.println(Arrays.toString(heap));
        List<Integer> topKList =Arrays.stream(heap).boxed().collect(Collectors.toList());
        Assertions.assertTrue(topKList.contains(6)&&topKList.contains(7)&&topKList.contains(8)&&topKList.contains(9));
    }

    @Test
    public void BinarySearchTest()
    {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int expected3 = 3;
        var res3 = InterView.BinarySearch(arr,expected3);
        Assertions.assertTrue(res3==3,"Index should be 3");

        int expected5 = 5;
        var res5 = InterView.BinarySearch(arr,expected5);
        Assertions.assertTrue(res5==5,"Index should be 5");

        int expected0 = 0;
        var res0 = InterView.BinarySearch(arr,expected0);
        Assertions.assertTrue(res0==0,"Index should be 0");

        int expected9 = 9;
        var res9 = InterView.BinarySearch(arr,expected9);
        Assertions.assertTrue(res9==9,"Index should be 9");
    }

    @Test
    public void ShuffleTest()
    {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] notexpected = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Before Shuffle:");
        System.out.println(Arrays.toString(arr));
        InterView.Shuffle(arr);
        System.out.println("After Shuffle:");
        System.out.println(Arrays.toString(arr));
        Assertions.assertFalse(arr.equals(notexpected));
    }
}