// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<=k-2;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        for(int j=0,i=k-1;i<A.length;){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            
            list.add(map.size());
            
            int freq=map.get(A[j]);
            if(freq==1){
                map.remove(A[j]);
            }else{
                map.put(A[j],freq-1);
            }
            i++;
            j++;
        }
        return list;
    }
}

