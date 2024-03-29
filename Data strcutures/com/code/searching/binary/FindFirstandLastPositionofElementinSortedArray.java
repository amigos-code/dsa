package com.code.searching.binary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        List<Integer> val= Arrays.stream(nums).boxed().collect(Collectors.toList());
        int value=val.indexOf(target);
        int value1=val.lastIndexOf(target);
            arr[0]=value;
            arr[1]=value1;
        return arr;
    }
}
