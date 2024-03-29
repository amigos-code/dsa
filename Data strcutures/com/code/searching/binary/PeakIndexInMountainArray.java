package com.code.searching.binary;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid-1]>arr[mid] &&  arr[mid+1]<arr[mid]){
                return mid;
            }else if(arr[mid]<arr[mid-1]){
                start=mid+1;

            }
            else if (arr[mid]<arr[mid+1]){
                start=mid+1;

            }
        }


        return 0;
    }

    public static void main(String[] args) {
        int ar[]={0,1,3,5,6,10,4,3,2};
        System.out.println(peakIndexInMountainArray(ar));
    }


}
