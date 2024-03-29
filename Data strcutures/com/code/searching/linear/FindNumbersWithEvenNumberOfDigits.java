package com.code.searching.linear;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int arr[]={12,345,2,7896};
        System.out.println(countEvenDigits(arr));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        if(nums.length==0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            int element=nums[i];
            int numCount=0;
            while(element!=0){
                element=element/10;
                numCount++;
            }
            if(numCount%2==0){
                count++;
            }

        }
        return count;
    }



    static int countEvenDigits(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            String value=String.valueOf(arr[i]);
            if(value.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
