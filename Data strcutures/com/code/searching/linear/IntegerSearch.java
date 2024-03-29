package com.code.searching.linear;

public class IntegerSearch {

    public static void main(String[] args) {
        int arr[]={34,54,-9,12,99};
        System.out.println("Search and return index "+searchAndReturnIndex(arr,-9));
        System.out.println("Search and return index "+searchAndReturnValue(arr,105));
        System.out.println("Search and return index "+searchAndReturnBooleanValue(arr,105));
    }

    //search for an element and return index
    static int searchAndReturnIndex(int arr[],int target){
        if(arr.length==0)
            return -1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    //search for an element and return value;
    static int searchAndReturnValue(int arr[],int target){
        if(arr.length==0)
            return -1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
        return -1;
    }
    //search for an element and return true or false
    static boolean searchAndReturnBooleanValue(int arr[],int target){
        if(arr.length==0)
            return false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
