package com.zmotive;

public class StringAlgorithms {

    public static String ReverseSentence(String sentence){
        var tmp = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = tmp.length-1;i>=0;i--){
            sb.append(tmp[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
