package com.hughwin.cracking;

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

}
