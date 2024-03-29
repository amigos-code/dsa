package com.code.searching.binary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountPairsWhoseSumisLessthanTarget {

    public static void main(String[] args) {
        System.out.println(countPairs(Arrays.asList(-6,2,5,-2,-7,-1,3),-2));
    }
    static int countPairs(List<Integer> nums, int target) {
        int count=0;
        Collections.sort(nums);

        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }
        return  count;
    }
}
