package com.zmotive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringAlgorithmsTest {
    @Test
    public void ReverseSentenceTest(){
        String sentence = "Hello World I'm Jeremy Zhang";
        var res = StringAlgorithms.ReverseSentence(sentence);
        Assertions.assertEquals("Zhang Jeremy I'm World Hello",res);
    }

}