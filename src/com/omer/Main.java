package com.omer;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String desperation = "Desperation";
        String rope = "A Rope Ends it";

isAreAnagrams(desperation,rope);

    }
static void isAreAnagrams(String string1, String string2){
        String tempString1 = string1;
        String tempString2 = string2;

        if (string1.contains(" ")) {
            string1 = string1.replaceAll(" ", "");
        }
        if (string2.contains(" ")) {
            string2 = string2.replaceAll("\\s+", "");
        }

char [] array1 = string1.toLowerCase(Locale.ROOT).toCharArray();
char [] array2 = string2.toLowerCase(Locale.ROOT).toCharArray();

boolean isCountAsAnagram = true;
if (array1.length != array2.length) {
    isCountAsAnagram = false;
}else{
    Arrays.sort(array1);
    Arrays.sort(array2);
    isCountAsAnagram = Arrays.equals(array1,array2);
        }
        if (isCountAsAnagram){
            System.out.println("'"+tempString1+"' and '"+tempString2+"' are anagrams");
    }else{
            System.out.println("'"+tempString1+"' and '"+tempString2+"' are NOT anagrams");
        }
}


}
