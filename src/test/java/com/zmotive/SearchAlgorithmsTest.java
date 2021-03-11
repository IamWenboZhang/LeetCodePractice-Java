package com.zmotive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchAlgorithmsTest {

    @Test
    public void BinarySearchTest(){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int expected = 5;
        //SortAlgorithm.Shuffle(arr);
        var res = SearchAlgorithms.BinarySearch(arr,5);
        Assertions.assertEquals(5,res);
    }
}