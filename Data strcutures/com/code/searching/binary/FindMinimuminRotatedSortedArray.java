package com.code.searching.binary;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        List<Integer> vals= Arrays.stream(nums).boxed().collect(Collectors.toList());
        return vals.get(0);
    }

    public boolean search(int[] nums, int target) {
        Set<Integer> vals=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Collections.sort(new ArrayList(vals));
        return vals.contains(target)?true:false;
    }
}

