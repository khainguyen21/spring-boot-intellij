package com.khaidevcode;

public class LongestString {

    public String find(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String longest = strings[0];
        for (String str : strings) {
            if (str != null && str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}
