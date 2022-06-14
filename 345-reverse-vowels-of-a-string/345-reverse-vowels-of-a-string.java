class Solution {
    public boolean isVowel(char[] arr,int index){
        char ch=arr[index];
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
    public void swap(char[] arr,int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && isVowel(arr,left)==false){
                left++;
                    
            }
            while(left<right && isVowel(arr,right)==false){
                right--;
            }
            swap(arr,left,right);
            left++;
            right--;
        }
        String str="";
        for(char ch:arr){
            str+=ch;
        }
        return str;
    }
}