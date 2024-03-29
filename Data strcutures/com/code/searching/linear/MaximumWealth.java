package com.code.searching.linear;

public class MaximumWealth {

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,2,1}};
        maximumWealth(arr);
    }

    static int maximumWealth(int[][] accounts) {
if(accounts.length==0){
    return -1;
}
        int max=Integer.MIN_VALUE;
for(int row=0;row<accounts.length;row++){
    int sum=0;

    for(int col=0;col<accounts[row].length;col++){
        sum=sum+accounts[row][col];
    }
    if(sum>max) {
        max = sum;
    }
}

        return max;
    }
}
