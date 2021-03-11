package com.zmotive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAlgorithmTest {
    @Test
    public void ReverseSentenceTest(){
        String sentence = "Hello World I'm Jeremy Zhang";
        var res = StringAlgorithm.ReverseSentence(sentence);
        Assertions.assertEquals("Zhang Jeremy I'm World Hello",res);
    }

}