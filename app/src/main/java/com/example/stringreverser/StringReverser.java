package com.example.stringreverser;

public class StringReverser {
    String reverse (String string){
        char[] characterString = string.toCharArray();
        String a = "";
        for(int i=characterString.length;i!=0;i--)
            a+= characterString[i-1] ;

        return a;

    }

}
