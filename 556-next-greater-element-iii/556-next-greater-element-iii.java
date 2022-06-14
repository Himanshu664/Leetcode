class Solution {
    public int nextGreaterElement(int n) {
        String charString=Integer.toString(n);
        char[] arr=charString.toCharArray();
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i==-1){
            return -1;
        }
        int k=arr.length-1;
        while(arr[i]>=arr[k]){
            k--;
        }
        char temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
        
        String res="";
        for(int j=0;j<=i;j++){
            res+=arr[j];
        }
    
        for(int j=arr.length-1;j>i;j--){
            res+=arr[j];
        }
        long ans = Long.parseLong(res);
        return ans>Integer.MAX_VALUE?-1:(int)ans;
        
        
        
    }
}