class Solution {
    public int countOfSubsetSum(int[] arr,int sum,int n){
       
        int[][] t=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j]=0;
                }if(j==0){
                    t[i][j]=1;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
        if(arr[i-1]<=j){
            t[i][j]=t[i-1][j] + t[i-1][j-arr[i-1]];
        }else{
            t[i][j]=t[i-1][j];
        }
    }
}
        return t[n][sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
         int n=nums.length;
        int sumOfArray=0;
        for(int i=0;i<nums.length;i++){
            sumOfArray+=nums[i];
        }
        int diff=(sumOfArray+target)/2;
        if(sumOfArray < Math.abs(target) || (sumOfArray + target) % 2 != 0)
            return 0;
        return countOfSubsetSum(nums,diff,n);
    }
}