package com.hughwin.cracking;

import java.util.Arrays;
import java.util.HashSet;

public class Solutions {

    public static void main(String[] args) {

    }

    //1.1 Is Unique

    public static boolean isUnique(String str){
        HashSet<Character> uniques = new HashSet<>();
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(!uniques.add(c)) return false;
        }
        return true;
    }

    public static boolean isUniqueNoExtraSpace(String str){
        char[] stringChar = str.toCharArray();
        for(int i = 0; i < stringChar.length ; i++){
            for(int j = 0; j < stringChar.length ; j++){
                if(i == j) continue;
                if(stringChar[i] == stringChar[j]) return false;
            }
        }
        return true;
    }

    //1.2 String permutation

    public static boolean stringPermutation(String stringA, String stringB) {
        char[] charArrayA = stringA.toCharArray();
        char[] charArrayB = stringB.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        return Arrays.equals(charArrayA, charArrayB);
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder();
        Character current = str.charAt(0);
        int count = 0, index = 0;
        char[] chars = str.toCharArray();
        while (index < chars.length) {
            if (chars[index] != current) {
                sb.append(current);
                sb.append(count);
                count = 0;
                current = chars[index];
            }
            count++;
            index++;
        }
        sb.append(current);
        sb.append(count);
        if(sb.toString().length() >= str.length()) return str;
        return sb.toString();
    }

}
