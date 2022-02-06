// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int solve(int[] arr,int a,int b,int[][] t){
         if(a>=b){
             return 0;
         }
         if(t[a][b]!=-1){
             return t[a][b];
         }
         int min =Integer.MAX_VALUE;
         for(int k=a;k<=b-1;k++){
             int temp=solve(arr,a,k,t)+solve(arr,k+1,b,t)+arr[a-1]*arr[k]*arr[b];
             if(temp<min){
                 min=temp;
             }
         }
         
         
         return t[a][b]=min;
    }
    static int matrixMultiplication(int N, int arr[])
    {
    
     int[][] t=new int[N][N];
     for(int i=0;i<N;i++){
         Arrays.fill(t[i],-1);
     }
     return solve(arr,1,N-1,t);
    }
}