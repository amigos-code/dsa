package com.code.searching.linear;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,56},{7,78,0,99}};
        //System.out.println("searchAndReturnIndex "+searchAndReturnIndex(arr,99));
        int result[]=searchAndReturnIndex(arr,99);
        for(int i=0;i<result.length;i++){
            System.out.print(result[1]+" ");
        }
        System.out.println();
        System.out.println("searchAndReturnValue "+searchAndReturnValue(arr,99));
        System.out.println("searchAndReturnBooeanValue "+searchAndReturnBooeanValue(arr,99));
    }

   //Search And return index;
    static int[] searchAndReturnIndex(int arr[][],int target){
        int result[]=new int[2];
        if(arr.length==0)
            return new int[-1];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    result[0]=row;
                    result[1]=col;
                    ;
                }
            }
        }
        return result;
    }

    //search and return value;
    static int searchAndReturnValue(int arr[][],int target){
        if(arr.length==0)
            return -1;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return arr[row][col];
            }
        }
        return -1;
    }
    //search and return true/false
    static boolean searchAndReturnBooeanValue(int arr[][],int target){
        if(arr.length==0)
            return false;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return true;
            }
        }
        return false;
    }
}
