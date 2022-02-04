class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int ans=0;
        int[][] t=new int[m+1][n+1];
        // for(int i=0;i<m+1;i++){
        //     for(int j=0;j<n+1;j++){
        //         if(i==0 || j==0){
        //             t[i][j]=1;
        //         }
        //     }
        // }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(nums1[i-1]==nums2[j-1]){
                    t[i][j]=1+t[i-1][j-1];
                }if(t[i][j]>ans){
                    ans=t[i][j];
                }
            }
        }
        return ans;
    }
}