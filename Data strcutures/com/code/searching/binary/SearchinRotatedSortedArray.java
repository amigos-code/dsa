package com.code.searching.binary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        List<Integer> val= Arrays.stream(nums).boxed().collect(Collectors.toList());
        return val.contains(target)?val.indexOf(target):-1;

    }
}
