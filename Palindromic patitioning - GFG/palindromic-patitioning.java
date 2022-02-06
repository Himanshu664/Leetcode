// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isPalindrome(String str,int a,int b){
        if(a==b){
            return true;
        }if(a>b){
            return true;
        }while(a<b){
            if(str.charAt(a)!=str.charAt(b)){
                return false;
                
            }
            a++;
                b--;
        }
        return true;
    }
    static int solve(String str,int a,int b,int[][] t){
        if(a>=b){
            return 0;
        }
        if(isPalindrome(str,a,b)){
            return 0;
        }
        if(t[a][b]!=-1){
            return t[a][b];
        }
        
        int min= Integer.MAX_VALUE; 
        for(int k=a;k<=b-1;k++){
           int left=0;
            int right=0;
            if(t[a][k]!=-1){
                left=t[a][k];
            }else{
                left=solve(str,a,k,t);
            }
            if(t[k+1][b]!=-1){
                right=t[k+1][b];
            }else{
                right=solve(str,k+1,b,t);
            }
            int temp=1+left+right;
            min=Math.min(min,temp);
        }
        return t[a][b]=min;
    }
    static int palindromicPartition(String str)
    {
    int N=str.length();
     int[][] t=new int[N+1][N+1];
     for(int i=0 ; i<N+1 ; i++){
            for(int j=0 ; j<N+1 ; j++){
                t[i][j] = -1;
            }
        }
     return solve(str,0,N-1,t);
        
    }
}