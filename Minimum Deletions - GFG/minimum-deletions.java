// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution{
    public static int lcs(String str1,String str2,int m,int n){
        int[][] t=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                t[i][j]=0;
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    } 
    public static int longestPalindromeSubseq(String s) {
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();
        int m=s.length();
        int n=input1.length();
        return lcs(s,input1.toString(),m,n);
 
    }
    static int minimumNumberOfDeletions(String S) {
       int ans=longestPalindromeSubseq(S);
       return S.length()-ans;
       
    }
}