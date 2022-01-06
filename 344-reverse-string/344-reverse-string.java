class Solution {
    public void reverseString(char[] s) {
        // int[] arr=new arr[s.length];
        char temp;
        int start=0;
        int end=s.length-1;
        while(start<end){
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        
       
        for(int j=0;j<s.length;j++){
            System.out.print(s[j] + " ") ;
        }
    }
}