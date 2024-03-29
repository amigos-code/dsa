package com.code.searching.linear;

public class StringSearch {

    public static void main(String[] args) {
        String str="Deepak";
        System.out.println("searchAndReturnIndex "+searchAndReturnIndex(str,'e'));
        System.out.println("searchAndReturnIndex "+searchAndReturnCharcter(str,'e'));
        System.out.println("searchAndReturnIndex "+searchAndReturnBooleanValue(str,'j'));
    }


    //search in a string and return index
    static int searchAndReturnIndex(String str,char target){
        if(str.length()==0)
            return -1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return  i;
            }
        }
        return -1;

    }
    //search in a string and return character
    static char searchAndReturnCharcter(String str,char target){
        if(str.length()==0)
            return (char) -1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return  str.charAt(i);
            }
        }
        return (char) -1;

    }
    //search in a string and return true/false
    static boolean searchAndReturnBooleanValue(String str,char target){
        if(str.length()==0)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return  true;
            }
        }
        return false;

    }
}
